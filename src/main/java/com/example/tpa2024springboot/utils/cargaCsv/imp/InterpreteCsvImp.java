package com.example.tpa2024springboot.utils.cargaCsv.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import com.example.tpa2024springboot.model.entities.contribuciones.imp.Distribucion;
import com.example.tpa2024springboot.model.entities.contribuciones.imp.DonacionDeVianda;
import com.example.tpa2024springboot.model.entities.contribuciones.imp.DonarDinero;
import com.example.tpa2024springboot.model.entities.contribuciones.imp.RegistroDePersonaVulnerable;
import com.example.tpa2024springboot.model.entities.medioDeContacto.MedioDeContacto;
import com.example.tpa2024springboot.model.entities.persona.Persona;
import com.example.tpa2024springboot.model.enums.TipoDeDocumento;
import com.example.tpa2024springboot.model.enums.TipoDeMedio;
import com.example.tpa2024springboot.utils.cargaCsv.InterpreteCsv;
import com.example.tpa2024springboot.utils.cargaCsv.LectorCsv;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class InterpreteCsvImp implements InterpreteCsv {
  private LectorCsv lectorCsv;

  @Override
  public ArrayList<Persona> obtenerPersonas(InputStream inputStream, String separador) throws IOException {
    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<String> personasCsv = lectorCsv.leerArchivo(inputStream);

    personasCsv.stream().forEach(persona -> {
      Persona personaCsv;
      if(exiteColaboradorCsv(personas, persona, ",")) {
        personaCsv = buscarColaboradorCsv(personas, persona, ",");
      } else {
        personaCsv = colaboradorCSV(persona, ",");
        personas.add(personaCsv);
      }
      Contribucion contribucion = toContribucionCsv(persona, ",");
      contribucion.setColaborador(personaCsv);
    });
    return personas;
  }

  public boolean exiteColaboradorCsv(ArrayList<Persona> colaboradores, String lectura, String separador) {
    String[] datos = lectura.split(separador);

    return colaboradores.stream().anyMatch(colaborador ->
        colaborador.getNroDeDocumento().equals(datos[1]) &&
            colaborador.getTipoDeDocumento() == toTipoDocumento(datos[0]));
  }

  public Persona buscarColaboradorCsv(ArrayList<Persona> colaboradores, String lectura, String separador) {
    String[] datos = lectura.split(separador);

    return colaboradores.stream().filter(colaborador ->
            colaborador.getNroDeDocumento().equals(datos[1]) &&
                colaborador.getTipoDeDocumento() == toTipoDocumento(datos[0]))
        .findFirst().get();
  }

  public Persona colaboradorCSV(String lectura, String separador) {
    String[] datos = lectura.split(separador);

    TipoDeDocumento tipoDocumento = toTipoDocumento(datos[0]);
    String nroDocumento = datos[1];
    String nombre = datos[2];
    String apellido = datos[3];
    MedioDeContacto medioDeContacto = MedioDeContacto.builder()
        .address(datos[4])
        .tipoDeMedio(TipoDeMedio.EMAIL)
        .build();

    return Persona.builder()
        .nombre(nombre)
        .apellido(apellido)
        .nroDeDocumento(nroDocumento)
        .tipoDeDocumento(tipoDocumento)
        .medioDeContacto(medioDeContacto)
        .build();
  }

  public TipoDeDocumento toTipoDocumento(String datoCsv) {
    if (datoCsv.equals("LC")) {
      return TipoDeDocumento.LIBRETA_CIVICA;
    } if (datoCsv.equals("LE")) {
      return TipoDeDocumento.LIBRETA_DE_ENROLAMIENTO;
    } if (datoCsv.equals("DNI")) {
      return TipoDeDocumento.DNI;
    }
    return null;
  }

  public Contribucion toContribucionCsv(String lecturaCsv, String separador) {
    String[] datosContribucion = lecturaCsv.split(separador);

    LocalDate fecha = LocalDate.parse(datosContribucion[5], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String tipo = datosContribucion[6];
    Integer cantidad = Integer.parseInt(datosContribucion[7]);

    if (tipo.equals("DINERO")) {
      return DonarDinero.builder()
          .monto(cantidad.doubleValue())
          .fechaDeDonacion(fecha)
          .build();
    }
    if (tipo.equals("DONACION_VIANDAS")) {
      return DonacionDeVianda.builder()
          .cantidad(cantidad)
          .fecha(fecha)
          .build();
    }
    if (tipo.equals("REDISTRIBUCION_VIANDAS")) {
      return Distribucion.builder()
          .cantidadMovida(cantidad)
          .build();
    }
    if (tipo.equals("ENTREGA_TARJETAS")) {
      return RegistroDePersonaVulnerable.builder()
          .cantidadEntregada(cantidad)
          .build();
    }
    return null;
  }
}

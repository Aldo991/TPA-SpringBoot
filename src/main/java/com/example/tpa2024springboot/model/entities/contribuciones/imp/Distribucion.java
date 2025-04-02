package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import com.example.tpa2024springboot.model.enums.TipoDeMotivo;
import java.time.LocalDate;
import lombok.Builder;

@Builder
public class Distribucion extends Contribucion {
  private Heladera origen;
  private Heladera destino;
  private Integer cantidadMovida;
  private TipoDeMotivo motivo;
  private LocalDate fechaDeDistribucion;

  @Override
  public void contribuir() {

  }
  @Override
  public Double obtenerPuntos() {
    return cantidadMovida.doubleValue();
  }
}

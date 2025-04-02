package com.example.tpa2024springboot.model.entities.incidente;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import com.example.tpa2024springboot.model.entities.persona.Persona;
import java.time.LocalDateTime;

public class Incidente {
  private LocalDateTime fecha;
  private Heladera heladera;
  private String descripcion;
  private Persona persona;
  private String pathFoto;
  private TipoDeIncidente tipoDeIncidente;
}

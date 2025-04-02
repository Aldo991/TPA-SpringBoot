package com.example.tpa2024springboot.model.entities.tecnico;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import java.time.LocalDate;

public class ReporteTecnico {
  private LocalDate fecha;
  private Heladera heladeraVisitada;
  private Tecnico tecnico;
  private String descripcion;
  private String pathFoto;
  private Boolean solucionado;
}

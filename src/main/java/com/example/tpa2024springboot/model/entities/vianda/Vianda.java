package com.example.tpa2024springboot.model.entities.vianda;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vianda {
  private String comida;
  private LocalDate fechaDeCaducidad;
  private LocalDateTime fechaDeDonacion;
  private Integer cantidad;
  private Heladera heladeraContenedora;
  private Integer cantidadDeCalorias;
  private Double peso;
}

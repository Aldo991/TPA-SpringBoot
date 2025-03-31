package com.example.tpa2024springboot.model.entities.heladera;

import com.example.tpa2024springboot.model.entities.direccion.Ubicacion;
import java.time.LocalDate;

public class Heladera {
  private Ubicacion ubicacion;
  private String nombreHeladera;
  private Integer capacidadMaximaDeViandas;
  private Double temperaturaMax;
  private Double temperaturaMin;
  private LocalDate fechaDeFuncionamiento;
}

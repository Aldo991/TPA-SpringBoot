package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import java.time.LocalDateTime;

public class DonarDinero extends Contribucion {
  private LocalDateTime fechaDeDonacion;
  private Double monto;
  private Integer frecuencia; //en dias

  @Override
  public void contribuir() {

  }
}

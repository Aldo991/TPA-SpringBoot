package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import com.example.tpa2024springboot.model.entities.vianda.Vianda;

public class DonacionDeVianda extends Contribucion {
  private Integer cantidad;
  private Vianda tipoDeVianda;

  @Override
  public void contribuir() {

  }
}

package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import com.example.tpa2024springboot.model.entities.heladera.Heladera;

public class HacerseCargoDeHeladera extends Contribucion {
  private Heladera heladera;

  @Override
  public void contribuir() {

  }

  @Override
  public Double obtenerPuntos() {
    return 0.0;
  }
}

package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import lombok.Builder;

@Builder
public class RegistroDePersonaVulnerable extends Contribucion {
  //TODO falta el resgistro de la persona
  private Integer cantidadEntregada;

  @Override
  public void contribuir() {
  }

  @Override
  public Double obtenerPuntos() {
    return 1.0;
  }
}

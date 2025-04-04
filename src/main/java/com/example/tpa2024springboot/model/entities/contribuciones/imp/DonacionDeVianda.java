package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import com.example.tpa2024springboot.model.entities.vianda.Vianda;
import java.time.LocalDate;
import lombok.Builder;

@Builder
public class DonacionDeVianda extends Contribucion {
  private LocalDate fecha;
  private Integer cantidad;
  private Vianda tipoDeVianda;

  @Override
  public void contribuir() {

  }

  @Override
  public Double obtenerPuntos() {
    return cantidad.doubleValue() * 1.5;
  }
}

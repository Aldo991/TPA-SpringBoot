package com.example.tpa2024springboot.model.entities.contribuciones.imp;

import com.example.tpa2024springboot.model.entities.contribuciones.Contribucion;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DonarDinero extends Contribucion {
  private LocalDate fechaDeDonacion;
  private Double monto;
  private Integer frecuencia; //en dias

  @Override
  public void contribuir() {

  }

  @Override
  public Double obtenerPuntos() {
    return monto * 0.5;
  }
}

package com.example.tpa2024springboot.model.entities.tarjeta;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import java.time.LocalDateTime;

public class UsoTarjeta {
  private LocalDateTime fechaDeUso;
  private Heladera heladera;
  private Tarjeta tarjeta;
}

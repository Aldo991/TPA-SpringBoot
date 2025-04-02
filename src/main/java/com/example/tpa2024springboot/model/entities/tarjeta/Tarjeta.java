package com.example.tpa2024springboot.model.entities.tarjeta;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Tarjetas")
public class Tarjeta {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "nro_tarjeta")
  private String nroTarjeta; //solo 11 caracteres
  @Column(name = "cant_de_usos")
  private Integer cantidadDeUsos;
}

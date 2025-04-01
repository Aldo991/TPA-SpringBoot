package com.example.tpa2024springboot.model.entities.direccion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Direccion {
  @Column(name = "direccion")
  private String direccion;
  @Embedded
  private Ubicacion ubicacion;
}

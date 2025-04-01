package com.example.tpa2024springboot.model.entities.direccion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Ubicacion {
  @Column(name = "latitud")
  private String latitud;
  @Column(name = "longitud")
  private String longitud;
}

package com.example.tpa2024springboot.model.entities.contribuciones;

import com.example.tpa2024springboot.model.entities.persona.Persona;

public abstract class Contribucion {
  private Persona colaborador;

  public abstract void contribuir();
}

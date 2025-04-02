package com.example.tpa2024springboot.model.entities.contribuciones;

import com.example.tpa2024springboot.model.entities.persona.Persona;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Contribucion {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @ManyToOne
  private Persona colaborador;

  public abstract void contribuir();
  public abstract Double obtenerPuntos();
}

package com.example.tpa2024springboot.model.entities.apertura;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import com.example.tpa2024springboot.model.entities.persona.Persona;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class Apertura {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "fecha_de_solicitud")
  private LocalDateTime fechaDeSolucitud; //el colaborador solo 3hs a partir de la solicitud
  @OneToOne
  private Persona personaSolicitante;
  @OneToOne
  private Heladera heladera;
}

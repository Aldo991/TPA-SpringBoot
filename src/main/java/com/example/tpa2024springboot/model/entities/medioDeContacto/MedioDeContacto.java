package com.example.tpa2024springboot.model.entities.medioDeContacto;

import com.example.tpa2024springboot.model.enums.TipoDeMedio;
import jakarta.persistence.*;

@Entity
public class MedioDeContacto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Enumerated
  @Column(name = "tipo_de_medio")
  private TipoDeMedio tipoDeMedio;
  @Column(name = "address")
  private String address;
}

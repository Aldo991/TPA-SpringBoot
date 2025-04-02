package com.example.tpa2024springboot.model.entities.medioDeContacto;

import com.example.tpa2024springboot.model.enums.TipoDeMedio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

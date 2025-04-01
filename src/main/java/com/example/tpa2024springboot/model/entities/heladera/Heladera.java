package com.example.tpa2024springboot.model.entities.heladera;

import com.example.tpa2024springboot.model.entities.direccion.Ubicacion;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Heladera {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Embedded
  private Ubicacion ubicacion;
  @Column(name = "nombre_heladera")
  private String nombreHeladera;
  @Column(name = "capacidad_max_viandas")
  private Integer capacidadMaximaDeViandas;
  @Column(name = "temperatura_max")
  private Double temperaturaMax;
  @Column(name = "temperatura_min")
  private Double temperaturaMin;
  @Column(name = "fecha_de_funcionamiento")
  private LocalDate fechaDeFuncionamiento;
}

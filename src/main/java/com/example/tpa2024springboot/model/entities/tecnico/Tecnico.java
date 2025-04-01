package com.example.tpa2024springboot.model.entities.tecnico;

import com.example.tpa2024springboot.model.entities.medioDeContacto.MedioDeContacto;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Tecnico {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "apellido")
  private String apelido;
  @Column(name = "tipo_documento")
  private String tipoDocumento;
  @Column(name = "nro_documento")
  private String nroDocumento;
  @Column(name = "cuil")
  private String cuil;
  @OneToOne(cascade = CascadeType.ALL)
  private MedioDeContacto medioDeContacto;
  @Transient
  private String areaDeCobertura; //revisar area de cobertura

  //TODO
}

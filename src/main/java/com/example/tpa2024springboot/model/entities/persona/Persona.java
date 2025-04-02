package com.example.tpa2024springboot.model.entities.persona;

import com.example.tpa2024springboot.model.entities.direccion.Direccion;
import com.example.tpa2024springboot.model.entities.medioDeContacto.MedioDeContacto;
import com.example.tpa2024springboot.model.enums.TipoDeDocumento;
import com.example.tpa2024springboot.model.enums.TipoDeRubro;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "apellido")
  private String apellido;
  @OneToOne(cascade = CascadeType.ALL)
  @Column(name = "id_medio_de_contacto")
  private MedioDeContacto medioDeContacto;
  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;
  @Embedded
  private Direccion direccion;
  @Column(name = "razon_social")
  private String razonSocial;
  @Enumerated(EnumType.STRING)
  @Column(name = "tipo_de_rubro")
  private TipoDeRubro tipoDeRubro;
  @Column(name = "nro_documento")
  private String nroDeDocumento;
  @Column(name = "tipo_documento")
  @Enumerated(EnumType.STRING)
  private TipoDeDocumento tipoDeDocumento;
}

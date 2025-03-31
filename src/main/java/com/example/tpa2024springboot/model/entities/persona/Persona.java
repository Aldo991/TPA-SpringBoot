package com.example.tpa2024springboot.model.entities.persona;

import com.example.tpa2024springboot.model.entities.direccion.Direccion;
import com.example.tpa2024springboot.model.entities.medioDeContacto.MedioDeContacto;
import com.example.tpa2024springboot.model.enums.TipoDeRubro;
import java.time.LocalDate;

public class Persona {
  private String nombre;
  private String apellido;
  private MedioDeContacto medioDeContacto;
  private LocalDate fechaNacimiento;
  private Direccion direccion;
  private String razonSocial;
  private TipoDeRubro tipoDeRubro;
}

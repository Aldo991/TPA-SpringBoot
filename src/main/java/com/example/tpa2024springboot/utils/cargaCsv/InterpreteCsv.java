package com.example.tpa2024springboot.utils.cargaCsv;

import com.example.tpa2024springboot.model.entities.persona.Persona;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public interface InterpreteCsv {
  public ArrayList<Persona> obtenerPersonas(InputStream inputStream, String separador) throws IOException;
}

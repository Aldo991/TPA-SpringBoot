package com.example.tpa2024springboot.utils.cargaCsv;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public interface LectorCsv {
  public ArrayList<String> leerArchivo(InputStream archivo) throws IOException;
}

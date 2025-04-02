package com.example.tpa2024springboot.utils.cargaCsv.imp;

import com.example.tpa2024springboot.utils.cargaCsv.LectorCsv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LectorCsvImp implements LectorCsv {
  @Override
  public ArrayList<String> leerArchivo(InputStream archivo) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(archivo);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    ArrayList<String> lectura = new ArrayList<>();

    while (bufferedReader.ready()) {
      lectura.add(bufferedReader.readLine());
    }
    bufferedReader.close();
    inputStreamReader.close();

    return lectura;
  }
}

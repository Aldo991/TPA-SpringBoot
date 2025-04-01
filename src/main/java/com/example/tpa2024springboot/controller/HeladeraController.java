package com.example.tpa2024springboot.controller;

import com.example.tpa2024springboot.dtos.input.HeladeraInputDto;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller("/heladeras")
public class HeladeraController {
  @PostMapping
  public RequestEntity<?> crearHeladera(@RequestBody HeladeraInputDto heladeraInputDto) {
    return null;
  }

  @GetMapping
  public RequestEntity<?> obtenerTodasLasHeladeras() {
    return null;
  }

  @GetMapping("/{id}")
  public RequestEntity<?> obtenerHeladera(@PathVariable Long id) {
    return null;
  }
}

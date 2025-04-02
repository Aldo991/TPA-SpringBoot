package com.example.tpa2024springboot.model.repositories;

import com.example.tpa2024springboot.model.entities.tecnico.Tecnico;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, UUID> {
}

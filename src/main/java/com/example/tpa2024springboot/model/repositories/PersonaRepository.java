package com.example.tpa2024springboot.model.repositories;

import com.example.tpa2024springboot.model.entities.persona.Persona;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, UUID> {
}

package com.example.tpa2024springboot.model.repositories;

import com.example.tpa2024springboot.model.entities.heladera.Heladera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeladeraRepository extends JpaRepository<Heladera, Long> {
}

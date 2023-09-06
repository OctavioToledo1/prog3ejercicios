package com.example.ejercicioMuchoaBidi.repositorios;

import com.example.ejercicioMuchoaBidi.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

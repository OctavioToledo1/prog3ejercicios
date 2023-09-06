package com.example.ejercicioUnoaMuchoUni.repositorios;

import com.example.ejercicioUnoaMuchoUni.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

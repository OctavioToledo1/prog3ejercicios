package com.example.ejercicioManyToMany.repositorios;

import com.example.ejercicioManyToMany.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}

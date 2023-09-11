package com.example.ejercicioViernes.repositorios;

import com.example.ejercicioViernes.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro, Long> {
}

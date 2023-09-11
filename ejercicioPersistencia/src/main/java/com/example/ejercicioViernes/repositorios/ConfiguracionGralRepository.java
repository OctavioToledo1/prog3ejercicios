package com.example.ejercicioViernes.repositorios;

import com.example.ejercicioViernes.entidades.ConfiguracionGral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionGralRepository extends JpaRepository<ConfiguracionGral, Long> {
}

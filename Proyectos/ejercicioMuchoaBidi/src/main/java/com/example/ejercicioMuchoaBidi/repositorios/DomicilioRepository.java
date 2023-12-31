package com.example.ejercicioMuchoaBidi.repositorios;

import com.example.ejercicioMuchoaBidi.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}

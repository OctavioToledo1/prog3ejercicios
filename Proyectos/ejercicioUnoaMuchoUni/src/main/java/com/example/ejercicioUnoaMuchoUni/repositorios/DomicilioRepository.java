package com.example.ejercicioUnoaMuchoUni.repositorios;

import com.example.ejercicioUnoaMuchoUni.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}

package com.example.apirest.repositories;

import com.example.apirest.entities.BaseEntidad;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E,ID> {
}

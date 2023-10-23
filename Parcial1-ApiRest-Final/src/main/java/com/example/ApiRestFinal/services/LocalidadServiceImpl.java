package com.example.ApiRestFinal.services;


import com.example.ApiRestFinal.entities.Localidad;
import com.example.ApiRestFinal.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository) {
        super(baseRepository);
    }
}

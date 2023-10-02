package com.example.apirest.controllers;



import com.example.apirest.entities.Autor;
import com.example.apirest.services.AutorServiceImpl;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") //permitir o no el acceso de distintos clientes-podemos acceder desde varios clientes
@RequestMapping(path = "api/v1/autores")
public class AutoController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}

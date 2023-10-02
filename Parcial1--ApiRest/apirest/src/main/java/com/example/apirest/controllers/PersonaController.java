package com.example.apirest.controllers;



import com.example.apirest.entities.Persona;
import com.example.apirest.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") //permitir o no el acceso de distintos clientes-podemos acceder desde varios clientes
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {



}

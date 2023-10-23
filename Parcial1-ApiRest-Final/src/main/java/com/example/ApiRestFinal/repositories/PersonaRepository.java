package com.example.ApiRestFinal.repositories;

import com.example.ApiRestFinal.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

    // Anotacion Metodo de Query

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //Utilizando Paginacion
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);


    // ANOTACION JPQL utilizando parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'") // el ? es para indicar que es indexadom, el 1 significa la cantidad de parametros que le pasamos al metodo
    List<Persona> search(@Param("filtro") String filtro);

    //UTILIZANDO PAGINACION
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'") // el ? es para indicar que es indexadom, el 1 significa la cantidad de parametros que le pasamos al metodo
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    //ANOTACION JPQL con parametros nombrados
    /*@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'") // el ? es para indicar que es indexadom, el 1 significa la cantidad de parametros que le pasamos al metodo
    List<Persona> search(@Param("filtro") String filtro);*/


    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            nativeQuery = true
    ) // el ? es para indicar que es indexadom, el 1 significa la cantidad de parametros que le pasamos al metodo
    List<Persona> searchNativo(@Param("filtro") String filtro);

    //UTILIZANDO PAGINACION
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM persona", //Query nativa para contar paginas
            nativeQuery = true
    ) // el ? es para indicar que es indexadom, el 1 significa la cantidad de parametros que le pasamos al metodo
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}

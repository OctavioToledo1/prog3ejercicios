package com.example.apirest.services;



import com.example.apirest.entities.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntidad, ID extends Serializable> {

    //Metodo para listar todos los registros
    public List<E> findAll() throws Exception;

    //Metodo para buscar un registro por id que le pasemos
    public E findById(ID id) throws Exception;

    //Metodo para guardar una entidad recibida
    public E save(E entity) throws Exception;

    //Metodo para actualizar un registro y devolvemos ese registro actualizado
    public E update(ID id, E entity) throws Exception;

    //Metodo para eliminar un registro con un id pasado;
    public boolean delete(ID id) throws Exception;

}

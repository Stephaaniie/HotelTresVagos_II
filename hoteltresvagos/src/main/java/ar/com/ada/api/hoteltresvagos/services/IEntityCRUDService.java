package ar.com.ada.api.hoteltresvagos.services;


import java.util.List;

import ar.com.ada.api.hoteltresvagos.excepciones.ResourceNotFoundException;

public interface IEntityCRUDService <T> {
    
    List<T> findAll();

    T findById(int id) throws ResourceNotFoundException;

    T save(T entity);

    void delete(T entity);

    void deleteById(int id);

    Long count();
}
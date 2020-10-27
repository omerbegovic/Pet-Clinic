package com.springproject.petclinic.services;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

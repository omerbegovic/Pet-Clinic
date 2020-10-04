package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}

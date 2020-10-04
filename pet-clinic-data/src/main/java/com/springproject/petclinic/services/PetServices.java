package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Pet;

import java.util.Set;

public interface PetServices {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}

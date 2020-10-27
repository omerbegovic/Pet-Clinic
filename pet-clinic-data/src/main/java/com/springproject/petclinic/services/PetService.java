package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Pet;
import org.springframework.stereotype.Component;

@Component
public interface PetService extends CrudService<Pet, Long> {

}

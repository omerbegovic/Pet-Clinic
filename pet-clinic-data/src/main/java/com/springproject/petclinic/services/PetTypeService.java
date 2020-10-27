package com.springproject.petclinic.services;

import com.springproject.petclinic.model.PetType;
import org.springframework.stereotype.Component;

@Component
public interface PetTypeService extends CrudService<PetType, Long> {
}

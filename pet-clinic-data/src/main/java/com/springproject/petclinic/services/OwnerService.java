package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Owner;
import org.springframework.stereotype.Component;

@Component
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

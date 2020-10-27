package com.springproject.petclinic.services;


import com.springproject.petclinic.model.Vet;
import org.springframework.stereotype.Component;

@Component
public interface VetService extends CrudService<Vet, Long> {

}

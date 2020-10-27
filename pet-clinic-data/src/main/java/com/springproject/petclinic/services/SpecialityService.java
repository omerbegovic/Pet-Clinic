package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Speciality;
import org.springframework.stereotype.Component;

@Component
public interface SpecialityService extends CrudService<Speciality, Long> {
}

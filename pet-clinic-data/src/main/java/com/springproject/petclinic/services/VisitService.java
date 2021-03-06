package com.springproject.petclinic.services;

import com.springproject.petclinic.model.Visit;
import org.springframework.stereotype.Component;

@Component
public interface VisitService extends CrudService<Visit, Long> {
}

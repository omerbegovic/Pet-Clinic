package com.springproject.petclinic.model;

import org.springframework.stereotype.Component;

@Component
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

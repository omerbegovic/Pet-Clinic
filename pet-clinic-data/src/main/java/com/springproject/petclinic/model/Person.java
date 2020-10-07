package com.springproject.petclinic.model;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName(String sam) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String mali) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

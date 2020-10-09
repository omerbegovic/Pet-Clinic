package com.springproject.petclinic.model;

public class Person extends BaseEntity {

    public String firstName;
    public String lastName;

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

    public String getName(){

        return this.firstName;

    }
}
package com.springproject.petclinic.bootstrap;

import com.springproject.petclinic.model.Owner;
import com.springproject.petclinic.model.Pet;
import com.springproject.petclinic.model.PetType;
import com.springproject.petclinic.model.Vet;
import com.springproject.petclinic.services.OwnerService;
import com.springproject.petclinic.services.PetTypeService;
import com.springproject.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Donje Mostre");
        owner1.setCity("Visoko");
        owner1.setTelephone("123123123");

        Pet michaelsPet = new Pet();
        michaelsPet.setPetType(savedDogPetType);
        michaelsPet.setOwner(owner1);
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setName("Bobi");
        owner1.getPets().add(michaelsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setLastName("Glena");
        owner2.setFirstName("Fiona");
        owner2.setAddress("125 Donje Mostre");
        owner2.setCity("Visoko");
        owner2.setTelephone("321321321");

        Pet fionasPet = new Pet();
        fionasPet.setName("Maci Mala");
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setPetType(savedCatPetType);
        owner2.getPets().add(fionasPet);


        ownerService.save(owner2);
        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();

        vet1.getFirstName("Sam");
        vet1.getLastName("Mali");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Mike");
        vet2.getLastName("Jagger");

        vetService.save(vet2);

        System.out.println("Loaded Vets");




    }
}

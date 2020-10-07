package com.springproject.petclinic.bootstrap;

import com.springproject.petclinic.model.Owner;
import com.springproject.petclinic.model.Vet;
import com.springproject.petclinic.services.OwnerService;
import com.springproject.petclinic.services.VetService;
import com.springproject.petclinic.services.map.OwnerServiceMap;
import com.springproject.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setLastName("Glena");
        owner2.setFirstName("Fiona");

        ownerService.save(owner2);
        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.getId(1L);
        vet1.getFirstName("Sam");
        vet1.getLastName("Mali");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mike");
        vet2.getLastName("Jagger");

        vetService.save(vet2);

        System.out.println("Loaded Vets");




    }
}

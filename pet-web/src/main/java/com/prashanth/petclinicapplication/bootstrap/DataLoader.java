package com.prashanth.petclinicapplication.bootstrap;

import com.prashanth.petclinicapplication.model.Owner;
import com.prashanth.petclinicapplication.model.Vet;
import com.prashanth.petclinicapplication.services.OwnerService;
import com.prashanth.petclinicapplication.services.VetService;
import com.prashanth.petclinicapplication.services.map.OwnerServiceMap;
import com.prashanth.petclinicapplication.services.map.VetServiceMap;
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
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glenane");

        ownerService.save(owner2);

        System.out.println("Loaded Owners list...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vet list...");
    }
}

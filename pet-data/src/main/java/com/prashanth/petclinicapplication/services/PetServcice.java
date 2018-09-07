package com.prashanth.petclinicapplication.services;

import com.prashanth.petclinicapplication.model.Pet;

import java.util.Set;

public interface PetServcice {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

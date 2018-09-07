package com.prashanth.petclinicapplication.services;

import com.prashanth.petclinicapplication.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

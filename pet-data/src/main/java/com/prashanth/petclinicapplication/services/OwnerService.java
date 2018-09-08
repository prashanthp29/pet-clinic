package com.prashanth.petclinicapplication.services;

import com.prashanth.petclinicapplication.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
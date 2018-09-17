package com.prashanth.petclinicapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/owners", "/owners/owners.html"})
    public String ownerIndex() {
        return "owners/owners";
    }
}

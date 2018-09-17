package com.prashanth.petclinicapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"/vets", "/vets/vets", "/vets/vets.html"})
    public String vetIndex() {
        return "vets/vets";
    }
}
package com.prashanth.petclinicapplication.controllers;

import com.prashanth.petclinicapplication.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/vets", "/vets/vets.html"})
    public String vetIndex(Model model) {
        model.addAttribute("vetList", vetService.findAll());
        return "vets/vets";
    }
}
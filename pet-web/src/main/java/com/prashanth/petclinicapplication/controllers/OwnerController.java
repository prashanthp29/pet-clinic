package com.prashanth.petclinicapplication.controllers;

import com.prashanth.petclinicapplication.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    /* to get access to Owner Services and using constructor injection */
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    /* add a model to send the information to the request */
    @RequestMapping({"/owners", "/owners/owners", "/owners/owners.html"})
    public String ownerIndex(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/owners";
    }
}

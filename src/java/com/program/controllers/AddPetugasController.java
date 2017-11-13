/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.controllers;

import com.program.models.PetugasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.program.services.PetugasManager;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafif
 */
@Controller
@RequestMapping("/addAdmin")
public class AddPetugasController {
    
     @Autowired
    PetugasManager manager;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView adminadd() {
        return new ModelAndView("adminadd", "command", new PetugasModel());
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String submitAdd(@ModelAttribute PetugasModel petugasModel){
        manager.addPetugasData(petugasModel);
        return "redirect:/adminlogin"; //redirect to index
    }
}

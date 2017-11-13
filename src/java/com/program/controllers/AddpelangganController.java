/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.controllers;

/**
 *
 * @author student
 */

import com.program.models.PelangganModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.program.services.PelangganManager;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/formSignup")
public class AddpelangganController {

    @Autowired
    PelangganManager manager;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView formSignup() {
        return new ModelAndView("formSignup", "command", new PelangganModel());
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String submitAdd(@ModelAttribute PelangganModel pelangganModel){
        manager.addPelangganData(pelangganModel);
        return "index"; //redirect to index
    }
    
}

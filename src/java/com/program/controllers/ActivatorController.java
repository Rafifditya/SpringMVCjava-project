/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.controllers;
import com.program.models.PelangganModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.program.services.PelangganManager;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafif
 */
@Controller
@RequestMapping("/activate")
public class ActivatorController {
    
    @Autowired
    PelangganManager manager;
    
    @RequestMapping(method = RequestMethod.GET)
    public String activate(@RequestParam("id")int id){
        manager.Activation(id);
        return "redirect:/indexlaund";
    }
    
    
}

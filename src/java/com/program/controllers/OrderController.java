/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.controllers;

import com.program.models.LaundryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.program.services.LaundryManager;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafif
 */
@Controller
@RequestMapping("/addOrder")
public class OrderController{
    
     @Autowired
    LaundryManager manager;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView orderadd() {
        return new ModelAndView("orderadd", "command", new LaundryModel());
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String submitAdd(@ModelAttribute LaundryModel laundryModel){
        manager.addLaundryData(laundryModel);
        String id = laundryModel.getId_pelanggan();
        return "redirect:/notashow?id="+ id; //redirect to index
    }
}

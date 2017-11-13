/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.program.services.LaundryManager;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Rafif
 */

@Controller
@RequestMapping("/notashow")
public class NotaShowController {
    
    @Autowired
    LaundryManager manager;
    
    @RequestMapping(method = RequestMethod.GET)
    public String get(@RequestParam("id")String id, Model model) {
        model.addAttribute("list", manager.getLaundryData(id));
        return "notapre";
    }

}

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
@RequestMapping("/adminlogin")
public class LoginAdminController {

    @Autowired
    PetugasManager petugasManager;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("loginadmin", "command", new PetugasModel());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView checklogin(@ModelAttribute PetugasModel petugasModel) {
        ModelAndView mv = new ModelAndView();
        PetugasModel peldata = petugasManager.getPetugasUsername(petugasModel.getUsername_p());
        if (peldata.getPassword_p().equals(petugasModel.getPassword_p())) {
            mv.setViewName("redirect:/adminpage");
            mv.addObject("userSession", peldata);
            System.out.print("<script> usernamequery:" + peldata.getUsername_p()+ " </script>");
            System.out.print("<script> usernamepel:" + petugasModel.getUsername_p()+ " </script>");
            System.out.print("<script> passquery:" + peldata.getPassword_p()+ " </script>");
            System.out.print("<script> passspel:" + petugasModel.getPassword_p() + " </script>");
        } else {
            mv.setViewName("redirect:/adminlogin");
        }
        return mv;
    }

    @RequestMapping(value = "_out")
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/";
    }
}

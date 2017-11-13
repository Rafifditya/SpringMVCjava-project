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
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rafif
 */
@Controller
@RequestMapping("/login")
public class LoginConntroller {

    @Autowired
    PelangganManager pelangganManager;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("loginlaun", "command", new PelangganModel());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView checklogin(@ModelAttribute PelangganModel pelangganModel, HttpSession httpSession) {
        ModelAndView mv = new ModelAndView();
        PelangganModel peldata = pelangganManager.getPelangganUsername(pelangganModel.getUsername_u());
        if (peldata.getPassword_u().equals(pelangganModel.getPassword_u())) {
            System.out.print("<script> usernamequery:" + peldata.getUsername_u() + " </script>");
            System.out.print("<script> usernamepel:" + pelangganModel.getUsername_u() + " </script>");
            System.out.print("<script> passquery:" + peldata.getPassword_u() + " </script>");
            System.out.print("<script> passspel:" + pelangganModel.getPassword_u() + " </script>");
            mv.setViewName("redirect:/indexlaund");
            httpSession.setAttribute("userSession", peldata);
        } else {
            mv.setViewName("redirect:/login");
            System.out.print("<script> usernamequery:" + peldata.getUsername_u() + " </script>");
            System.out.print("<script> usernamepel:" + pelangganModel.getUsername_u() + " </script>");
            System.out.print("<script> passquery:" + peldata.getPassword_u() + " </script>");
            System.out.print("<script> passspel:" + pelangganModel.getPassword_u() + " </script>");
        }
        return mv;
    }

    @RequestMapping(value = "_out")
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("userSession");
        return "redirect:/";
    }
}

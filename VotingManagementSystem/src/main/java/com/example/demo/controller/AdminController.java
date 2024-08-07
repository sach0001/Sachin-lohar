package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

import jakarta.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/adminregister")
    public String showAdminRegisterForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "adminregister"; // Ensure adminregister.html exists in templates
    }

    @PostMapping("/goadminregister")
    public String registerAdmin(@Valid @ModelAttribute Admin admin, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "adminregister"; // Return to the registration page if there are errors
        }
        adminService.saveAdmin(admin);
        return "redirect:/adminlogin"; // Redirect to the login page after registration
    }

    @GetMapping("/adminlogin")
    public String showAdminLoginForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "adminlogin"; // Ensure adminlogin.html exists in templates
    }

    @PostMapping("/adminlogin")
    public String login(@ModelAttribute Admin admin, Model model) {
        Admin loggedInAdmin = adminService.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
        if (loggedInAdmin != null) {
            // Login successful, redirect to a different page or show a success message
            return "loginsuccess"; // Ensure loginsuccess.html exists in templates
        } else {
            // Login failed, show error message
            model.addAttribute("error", "Invalid username or password");
            return "adminlogin"; // Return to the login page with error message
        }
    }
}

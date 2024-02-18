/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Employe.controller;

import com.example.Employe.Service.EmployeService;
import com.example.Employe.model.Employes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author trini
 */
@Controller
public class EmployerController {

    private EmployeService emps;

    public EmployerController(EmployeService emps) {
        super();
        this.emps = emps;
    }

    @GetMapping("/Employes")
    public String ListeEmployes(Model model) {
        model.addAttribute("Employes", emps.getAllEmployes());
        return "Employes";
    }

    @GetMapping("/Employes/new")
    public String CreateEmploye(Model model) {
        Employes emp = new Employes();
        model.addAttribute("Employe", emp);
        return "New_Employe";
    }

    @PostMapping("/Employes")
    public String SaveEmploye(@ModelAttribute("employe") Employes emp) {
        emps.SaveEmploye(emp);
        return "redirect:/Employes";
    }

    @GetMapping("/Employes/edit/{id}")
    public String editEmploye(@PathVariable Long id, Model model) {
        model.addAttribute("employe", emps.getEmploye(id));

        return "Edite_Employe";
    }

    @PostMapping("/Employes/{id}")
    public String UpdateEmploye(@PathVariable Long id, @ModelAttribute("employe") Employes emp, Model mpdel) {
        Employes Exist = emps.getEmploye(id);
        Exist.setId(id);
        Exist.setEmail(emp.getEmail());
        Exist.setNom(emp.getNom());
        Exist.setPrenom(emp.getPrenom());
        emps.UpdateEmploye(Exist);
        return "redirect:/Employes";
    }

    @GetMapping("/Employes/{id}")
    public String DeleteEmploye(@PathVariable Long id) {
        emps.Delete(id);
        return "redirect:/Employes";

    }

}

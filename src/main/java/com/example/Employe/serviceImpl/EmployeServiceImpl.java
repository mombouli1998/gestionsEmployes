/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Employe.serviceImpl;

import com.example.Employe.Repository.EmployeRepository;
import com.example.Employe.Service.EmployeService;
import com.example.Employe.model.Employes;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author trini
 */
@Service
public class EmployeServiceImpl implements EmployeService {

    private EmployeRepository Empr;

    public EmployeServiceImpl(EmployeRepository Empr) {
        super();
        this.Empr = Empr;
    }

    @Override
    public List<Employes> getAllEmployes() {
        return Empr.findAll();
    }

    @Override
    public Employes SaveEmploye(Employes s) {
        return Empr.save(s);
    }

    @Override
    public Employes getEmploye(Long id) {
        return Empr.findById(id).get();
    }

    @Override
    public Employes UpdateEmploye(Employes s) {
        return Empr.save(s);
    }

    @Override
    public void Delete(Long id) {
        Empr.deleteById(id);
    }

}

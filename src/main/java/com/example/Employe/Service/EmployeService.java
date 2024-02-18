/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Employe.Service;

import com.example.Employe.model.Employes;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author trini
 */
@Service
public interface EmployeService {
    List<Employes> getAllEmployes();

    Employes SaveEmploye(Employes s);

    Employes getEmploye(Long id);

    Employes UpdateEmploye(Employes s);

    void Delete(Long id);
}

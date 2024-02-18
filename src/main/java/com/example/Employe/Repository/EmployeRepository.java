/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Employe.Repository;

import com.example.Employe.model.Employes;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author trini
 */

public interface EmployeRepository extends JpaRepository<Employes, Long>{

    
}

package com.example.Employe;

import com.example.Employe.Repository.EmployeRepository;
import com.example.Employe.model.Employes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeApplication.class, args);
    }

    @Autowired
    private EmployeRepository empr;

    @Override
    public void run(String... args) throws Exception {
        /*
         * Employes emp1= new
         * Employes("mombouli","trinité","trinitemombouli@gmail.com");
         * empr.save(emp1);
         * Employes emp2= new Employes("Durant","dupant","DurantD@gmail.com");
         * empr.save(emp2);
         * Employes emp3= new Employes("Anne","Marie","AnneM@gmail.com");
         * empr.save(emp3);
         */
    }

}

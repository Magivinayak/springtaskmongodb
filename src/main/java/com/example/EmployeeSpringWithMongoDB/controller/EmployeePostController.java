package com.example.EmployeeSpringWithMongoDB.controller;

import com.example.EmployeeSpringWithMongoDB.entity.Employee;
import com.example.EmployeeSpringWithMongoDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeePostController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/addEmployee")
    public String allEmployee(){
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    //@ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@ModelAttribute Employee employee){
        service.createEmployee(employee);
        return "addEmployee";
    }

}

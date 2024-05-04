package com.example.EmployeeSpringWithMongoDB.controller;

import com.example.EmployeeSpringWithMongoDB.entity.Employee;
import com.example.EmployeeSpringWithMongoDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping("/displayAll")
    public List<Employee> displayAllEmployee(){
        return service.displayAllEmployees();
    }

    @GetMapping("/display/{id}")
    public Employee displayById(@PathVariable String id){
        return service.displayEmployee(id);
    }

}

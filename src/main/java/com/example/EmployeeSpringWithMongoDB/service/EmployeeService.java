package com.example.EmployeeSpringWithMongoDB.service;

import com.example.EmployeeSpringWithMongoDB.entity.Employee;
import com.example.EmployeeSpringWithMongoDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> displayAllEmployees(){
        return repository.findAll();
    }

    public Employee  displayEmployee(String id){
        return  repository.findById(id).get();
    }

    public Employee createEmployee(Employee employee){
        return repository.save(employee);
    }
}

package com.codeclan.example.projectstracker.controllers;

import com.codeclan.example.projectstracker.repositories.EmployeeRepository;
import com.codeclan.example.projectstracker.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){return employeeRepository.findAll();}


}

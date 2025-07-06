package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springdatajpa.entity.Employee;
import com.example.springdatajpa.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*") 
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee added!";
    }
}

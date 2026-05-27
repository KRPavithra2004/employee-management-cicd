package com.example.employeesystem.controller;

import com.example.employeesystem.model.Employee;
import com.example.employeesystem.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(
            @RequestBody Employee employee) {

        return service.saveEmployee(employee);
    }
}
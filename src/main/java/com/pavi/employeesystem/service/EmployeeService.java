package com.example.employeesystem.service;

import com.example.employeesystem.model.Employee;
import com.example.employeesystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }
}
package com.academy.security_jwt.controller;

import com.academy.security_jwt.model.entity.Employee;
import com.academy.security_jwt.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/departments")
    public List<String> getDepartments() {
        List<String> departments = new ArrayList<>();
        departments.add("Manager");
        departments.add("Engineering");

        return departments;
    }
}

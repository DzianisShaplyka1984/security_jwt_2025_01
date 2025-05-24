package com.academy.security_jwt.service;

import com.academy.security_jwt.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}

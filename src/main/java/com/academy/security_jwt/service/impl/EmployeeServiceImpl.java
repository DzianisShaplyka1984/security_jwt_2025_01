package com.academy.security_jwt.service.impl;

import com.academy.security_jwt.model.entity.Employee;
import com.academy.security_jwt.model.repository.EmployeeRepository;
import com.academy.security_jwt.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}

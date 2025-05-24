package com.academy.security_jwt.model.repository;

import com.academy.security_jwt.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

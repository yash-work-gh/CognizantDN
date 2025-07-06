package com.example.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdatajpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

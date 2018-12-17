package com.codeclan.example.projectstracker.repositories;

import com.codeclan.example.projectstracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

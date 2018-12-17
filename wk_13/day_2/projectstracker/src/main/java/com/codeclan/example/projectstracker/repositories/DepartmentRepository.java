package com.codeclan.example.projectstracker.repositories;

import com.codeclan.example.projectstracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

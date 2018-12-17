package com.codeclan.example.projectstracker.repositories;

import com.codeclan.example.projectstracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRespository extends JpaRepository<Project, Long> {
}

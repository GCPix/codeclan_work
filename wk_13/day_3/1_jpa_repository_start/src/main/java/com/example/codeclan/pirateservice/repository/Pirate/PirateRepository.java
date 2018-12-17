package com.example.codeclan.pirateservice.repository.Pirate;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PirateRepository extends JpaRepository<Pirate, Long>, PirateRepositoryCustom {
}

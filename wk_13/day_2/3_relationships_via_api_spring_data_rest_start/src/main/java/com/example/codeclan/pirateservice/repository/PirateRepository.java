package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.Projections.EmbedInPirate;
import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedInPirate.class)
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}

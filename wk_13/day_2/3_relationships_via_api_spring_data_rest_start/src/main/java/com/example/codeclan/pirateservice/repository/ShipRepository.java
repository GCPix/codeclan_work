package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.Projections.EmbedInPirate;
import com.example.codeclan.pirateservice.Projections.EmbedInShip;
import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedInShip.class)
public interface ShipRepository extends JpaRepository<Ship, Long>  {
}

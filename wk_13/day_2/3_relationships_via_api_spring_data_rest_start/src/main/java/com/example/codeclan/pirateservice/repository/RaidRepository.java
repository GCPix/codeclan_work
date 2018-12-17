package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.Projections.EmbedInPirate;
import com.example.codeclan.pirateservice.Projections.EmbedInRaid;
import com.example.codeclan.pirateservice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedInRaid.class)
public interface RaidRepository extends JpaRepository<Raid, Long> {
}

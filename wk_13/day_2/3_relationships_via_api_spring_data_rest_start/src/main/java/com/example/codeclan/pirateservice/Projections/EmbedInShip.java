package com.example.codeclan.pirateservice.Projections;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInShip", types = Ship.class)
public interface EmbedInShip {
    String getName();
    List<Pirate> getPirates();
}

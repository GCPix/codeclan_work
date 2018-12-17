package com.example.codeclan.pirateservice.Projections;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInPirate", types = Pirate.class)
public interface EmbedInPirate {
    String getFirstName();
    String getLastName();
    int getAge();
    Ship getShip();
    List<Raid> getRaids();
}

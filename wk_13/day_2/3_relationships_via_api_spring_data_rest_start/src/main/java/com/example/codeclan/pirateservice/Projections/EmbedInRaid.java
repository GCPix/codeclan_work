package com.example.codeclan.pirateservice.Projections;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedInRaid", types = Raid.class)

public interface EmbedInRaid {
    String getLocation();
    int getLoot();
    List<Pirate> getPirates();

}

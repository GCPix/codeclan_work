package com.example.codeclan.pirateservice.repository.Raid;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;

import java.util.List;

public interface RaidRepositoryCustom {

    List<Pirate> getPiratesForRaid(Raid raid);
    List<Raid> getRaidsWithLootGreaterThanValue(int value);
}

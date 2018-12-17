package com.example.codeclan.pirateservice.repository.Pirate;

import com.example.codeclan.pirateservice.models.Pirate;

import java.util.List;

public interface PirateRepositoryCustom  {

    List<Pirate> getPiratesOverGivenAge(int age);
}

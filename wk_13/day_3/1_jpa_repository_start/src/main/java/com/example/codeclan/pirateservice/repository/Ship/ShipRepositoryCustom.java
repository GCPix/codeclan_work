package com.example.codeclan.pirateservice.repository.Ship;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;

import java.util.List;

public interface ShipRepositoryCustom {

    //todo method signatures for custom ship logic

     List<Pirate> findAllPiratesForShip(Ship ship);
}

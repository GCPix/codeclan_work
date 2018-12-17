package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.Repositories.PirateRepository;
import com.codeclan.example.pirateservice.Repositories.RaidRepository;
import com.codeclan.example.pirateservice.Repositories.ShipRepository;
import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceApplicationTests {
    @Autowired
    PirateRepository pirateRepository;
    @Autowired
    ShipRepository shipRepository;
    @Autowired
    RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

    @Test
    public void createShip() {
        Ship ship = new Ship("The Flying Dutchman");
        shipRepository.save(ship);
    }


    @Test
    public void createPirateAndShip(){
        Ship ship1 = new Ship("The Flying Dutchman");
        shipRepository.save(ship1);

        Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship1);
        pirateRepository.save(pirate1);
    }

    @Test
    public void addPiratesAndRaids(){
        Ship ship = new Ship("The Flying Dutchman");
        shipRepository.save(ship);

        Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
        pirateRepository.save(pirate1);

        Raid raid1 = new Raid("Tortuga", 100);
        raidRepository.save(raid1);

        raid1.addPirate(pirate1);
        raidRepository.save(raid1);

    }

    @Test
    public void canDeletePirate() {
        Ship ship = new Ship("The Flying Dutchman");
        shipRepository.save(ship);
        Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
        pirateRepository.save(pirate1);

        Raid raid1 = new Raid("Tortuga", 100);
        raidRepository.save(raid1);

        raid1.addPirate(pirate1);
        raidRepository.save(raid1);

        Ship ship1 = new Ship("The Jolly Roger");
        shipRepository.save(ship1);
        Raid raid2 = new Raid("Orkney", 50);
        raidRepository.save(raid2);

        Pirate pirate2 = new Pirate("Captain", "Hook", 50, ship1);
        pirateRepository.save(pirate2);

        pirate2.addRaid(raid2);
        pirateRepository.save(pirate2);






    }
}

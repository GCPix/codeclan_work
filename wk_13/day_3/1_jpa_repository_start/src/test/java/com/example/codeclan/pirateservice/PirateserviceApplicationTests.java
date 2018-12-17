package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.repository.Pirate.PirateRepository;
import com.example.codeclan.pirateservice.repository.Raid.RaidRepository;
import com.example.codeclan.pirateservice.repository.Ship.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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



}

package com.codeclan.example.pirateservice.Controllers;

import com.codeclan.example.pirateservice.Repositories.PirateRepository;
import com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }
    @PostMapping("{id")
    public void deleteEmployee(@PathVariable Long id){
        pirateRepository.deleteById(id);
    }
}

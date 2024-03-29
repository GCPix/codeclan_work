package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    List<Whisky> findWhiskiesForYear(int Year);
    List<Whisky> findWhiskiesForRegion(String region);
    List<Whisky> findWhiskyFromDistilleryOfASpecificAge(Distillery distillery, int age);

}

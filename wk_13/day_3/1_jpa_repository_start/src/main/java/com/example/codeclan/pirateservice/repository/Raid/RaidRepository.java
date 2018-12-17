package com.example.codeclan.pirateservice.repository.Raid;

import com.example.codeclan.pirateservice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaidRepository extends JpaRepository<Raid, Long>, RaidRepositoryCustom{
}

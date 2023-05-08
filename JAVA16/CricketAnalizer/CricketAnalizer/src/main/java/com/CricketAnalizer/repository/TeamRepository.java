package com.CricketAnalizer.repository;

import com.CricketAnalizer.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}

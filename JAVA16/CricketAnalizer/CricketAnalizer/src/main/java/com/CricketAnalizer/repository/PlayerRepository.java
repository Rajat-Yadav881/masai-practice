package com.CricketAnalizer.repository;

import com.CricketAnalizer.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Long> {

    @Query(value = "SELECT p.* FROM player p WHERE p.team_id = :teamId", nativeQuery = true)
    List<Player> findByTeamId(@Param("teamId") Long teamId);

}

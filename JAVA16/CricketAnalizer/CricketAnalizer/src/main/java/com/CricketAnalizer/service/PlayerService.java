package com.CricketAnalizer.service;

import com.CricketAnalizer.Dto.PlayerDto;
import com.CricketAnalizer.model.Player;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {

     PlayerDto savePlayer(long teamId,PlayerDto playerDto);

     Player getPlayerById(Long playerId);

     List<Player> getAllPlayer();

     void deletePlayer();

     List<PlayerDto> allPlayerToTeam(Long teamId);

}

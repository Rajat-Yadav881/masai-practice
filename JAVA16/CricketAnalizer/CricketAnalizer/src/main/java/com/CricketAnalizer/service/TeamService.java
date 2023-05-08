package com.CricketAnalizer.service;

import com.CricketAnalizer.Dto.PlayerDto;
import com.CricketAnalizer.Dto.TeamDto;
import com.CricketAnalizer.model.Player;
import com.CricketAnalizer.model.Team;

import java.util.List;

public interface TeamService {
    TeamDto saveTeam(TeamDto teamDto);

    Team getTeamById(Long teamId);

    List<Team> getAllTeam();

    void deleteTeam(Long teamId);



}

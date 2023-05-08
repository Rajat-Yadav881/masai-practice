package com.CricketAnalizer.service.impl;

import com.CricketAnalizer.Dto.PlayerDto;
import com.CricketAnalizer.Dto.TeamDto;
import com.CricketAnalizer.model.Player;
import com.CricketAnalizer.model.Team;
import com.CricketAnalizer.repository.PlayerRepository;
import com.CricketAnalizer.repository.TeamRepository;
import com.CricketAnalizer.service.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ModelMapper modelMapper;
    /**
     * @param teamDto
     * @return
     */
    @Override
    public TeamDto saveTeam(TeamDto teamDto) {
        Team team = mapToTeam(teamDto);
        Team newTeam = teamRepository.save(team);

        return mapToTeamDto(newTeam);
    }

    /**
     * @param teamId
     * @return
     */
    @Override
    public Team getTeamById(Long teamId) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Team> getAllTeam() {
        List<Team> lst = teamRepository.findAll();
        return lst;
    }

    /**
     * @param teamId
     */
    @Override
    public void deleteTeam(Long teamId) {

    }




    private TeamDto mapToTeamDto(Team team){
        TeamDto dto = modelMapper.map(team,TeamDto.class);
        return dto;
    }
    private Team mapToTeam(TeamDto teamDto){
        Team Team = modelMapper.map(teamDto,Team.class);
        return Team;
    }
}

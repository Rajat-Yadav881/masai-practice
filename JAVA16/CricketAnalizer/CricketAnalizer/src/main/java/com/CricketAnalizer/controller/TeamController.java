package com.CricketAnalizer.controller;

import com.CricketAnalizer.Dto.TeamDto;
import com.CricketAnalizer.model.Team;
import com.CricketAnalizer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1/")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/team/")
    public ResponseEntity<TeamDto> createTeam(@RequestBody TeamDto teamDto){
        return new ResponseEntity<>(teamService.saveTeam(teamDto), HttpStatus.CREATED);
    }
}

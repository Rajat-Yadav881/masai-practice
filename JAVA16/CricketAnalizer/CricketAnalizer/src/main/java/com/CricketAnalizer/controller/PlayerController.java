package com.CricketAnalizer.controller;

import com.CricketAnalizer.Dto.PlayerDto;
import com.CricketAnalizer.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("teams/{teamId}/player")
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto playerDto,@PathVariable(value = "teamId") long teamId){
        return new ResponseEntity<>(playerService.savePlayer(teamId,playerDto), HttpStatus.CREATED);
    }

    @GetMapping("teams/{teamId}/all")
    public List<PlayerDto> getAllPlayerByTeam(@PathVariable(value = "teamId") long teamId){
        return playerService.allPlayerToTeam(teamId);
    }
}

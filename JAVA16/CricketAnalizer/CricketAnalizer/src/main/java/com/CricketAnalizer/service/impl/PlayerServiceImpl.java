package com.CricketAnalizer.service.impl;

import com.CricketAnalizer.Dto.PlayerDto;
import com.CricketAnalizer.exception.ResourceNotFoundException;
import com.CricketAnalizer.model.Player;
import com.CricketAnalizer.model.Team;
import com.CricketAnalizer.repository.PlayerRepository;
import com.CricketAnalizer.repository.TeamRepository;
import com.CricketAnalizer.service.PlayerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * @param playerDto
     * @return
     */
    @Override
    public PlayerDto savePlayer(long teamId,PlayerDto playerDto){
        Player player = mapToPlayer(playerDto);
        Team team = teamRepository.findById(teamId).orElseThrow(()->new ResourceNotFoundException("team","id",teamId));
        player.setTeam(team);

        Player newPlayer = playerRepository.save(player);

        PlayerDto newPlayerDto1 = mapToDto(newPlayer);
        return newPlayerDto1;
    }

    /**
     * @param playerId
     * @return
     */
    @Override
    public Player getPlayerById(Long playerId) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Player> getAllPlayer() {
        List<Player> lst = playerRepository.findAll();
        return lst;
    }

    /**
     *
     */
    @Override
    public void deletePlayer() {

    }

    /**
     * @param teamId
     * @return
     */
    @Override
    public List<PlayerDto> allPlayerToTeam(Long teamId) {
        List<Player> players = playerRepository.findByTeamId(teamId);

        return players.stream().map(p->mapToDto(p)).collect(Collectors.toList());
    }

    private PlayerDto mapToDto(Player player){
        PlayerDto dto = modelMapper.map(player,PlayerDto.class);
        return dto;
    }
    private Player mapToPlayer(PlayerDto playerDto){
        Player player = modelMapper.map(playerDto,Player.class);
        return player;
    }
}

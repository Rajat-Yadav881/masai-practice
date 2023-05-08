package com.CricketAnalizer.Dto;

import com.CricketAnalizer.model.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto {
    private long team_id;

    private String team_name;

    private String team_sports;

    private Set<Player> players = new HashSet<>();
}

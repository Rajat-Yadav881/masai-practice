package com.CricketAnalizer.Dto;

import com.CricketAnalizer.model.Team;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {
    private long player_id;

    private String player_name;

    private String player_position;

    private long totalScore;

    private long sixes;

    private long fours;

    private long wickets;

    private double strikeRate;

    private double economy;

    private Team team;
}

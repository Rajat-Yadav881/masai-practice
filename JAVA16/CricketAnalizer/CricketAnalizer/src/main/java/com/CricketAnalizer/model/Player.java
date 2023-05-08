package com.CricketAnalizer.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long player_id;

    @Column(name = "playerName",nullable = false)
    private String player_name;

    @Column(name = "playerPosition",nullable = false)
    private String player_position;

    @Column(name = "totalScore",nullable = false)
    private long totalScore;

    @Column(name = "sixes",nullable = false)
    private long sixes;

    @Column(name = "fours",nullable = false)
    private long fours;

    @Column(name = "wickets",nullable = false)
    private long wickets;

    @Column(name = "strikeRate",nullable = false)
    private double strikeRate;

    @Column(name = "economy",nullable = false)
    private double economy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id",nullable = false)
    private Team team;
}

package com.CricketAnalizer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long team_id;
    @Column(name = "teamName",nullable = false)
    private String team_name;
    @Column(name = "teamSport",nullable = false)
    private String team_sports;
    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Player> players = new HashSet<>();

}

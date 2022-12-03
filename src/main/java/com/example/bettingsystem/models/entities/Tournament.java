package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tournaments")
@NoArgsConstructor
@AllArgsConstructor
public class Tournament extends BaseEntity {

    private String name;
    private Set<Team> teams;
    private Set<Match> matches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(
    name = "tournaments_teams",
    joinColumns = @JoinColumn(name = "tournament_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "team_id", referencedColumnName = "id"))
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @OneToMany(mappedBy = "tournament", targetEntity = Match.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }
}

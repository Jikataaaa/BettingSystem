package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "matches")
@NoArgsConstructor
@AllArgsConstructor
public class Match extends BaseEntity {

    private Team homeTeam;
    private Team awayTeam;
    private Tournament tournament;
    private Instant startTime;

    @OneToOne
    @JoinColumn(name = "home_team_id", referencedColumnName = "id")
    public Team getHomeTeam() {
        return homeTeam;
    }


    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @OneToOne
    @JoinColumn(name = "away_team_id", referencedColumnName = "id")
    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
    @ManyToOne
    @JoinColumn(name = "tournament_id", referencedColumnName = "id")
    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
}

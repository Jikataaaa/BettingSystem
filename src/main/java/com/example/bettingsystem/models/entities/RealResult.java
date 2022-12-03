package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import com.example.bettingsystem.models.MatchStatistics;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "real_results")
public class RealResult extends MatchStatistics {

    private Match match;


    @OneToOne(mappedBy = "realResult", targetEntity = Match.class)
    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}

package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import com.example.bettingsystem.models.MatchStatistics;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bets")
@NoArgsConstructor
@AllArgsConstructor
public class Bet extends MatchStatistics {


    private Match match;
    private User user;


    @OneToOne
    @JoinColumn(name = "match_id", referencedColumnName = "id")
    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

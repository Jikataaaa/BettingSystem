package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teams")
@NoArgsConstructor
@AllArgsConstructor
public class Team extends BaseEntity {

    private String name;
    private Set<Tournament> tournaments;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "teams", targetEntity = Tournament.class)
    public Set<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(Set<Tournament> tournaments) {
        this.tournaments = tournaments;
    }
}

package com.example.bettingsystem.models.entities;

import com.example.bettingsystem.models.BaseEntity;
import com.example.bettingsystem.models.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role extends BaseEntity {


    @Enumerated(EnumType.STRING)
    private UserRole role;

}

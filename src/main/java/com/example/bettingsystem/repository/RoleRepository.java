package com.example.bettingsystem.repository;

import com.example.bettingsystem.models.entities.Role;
import com.example.bettingsystem.models.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(UserRole role);
}

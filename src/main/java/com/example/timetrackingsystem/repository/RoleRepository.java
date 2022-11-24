package com.example.timetrackingsystem.repository;

import com.example.timetrackingsystem.models.entities.Role;
import com.example.timetrackingsystem.models.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(UserRole role);
}

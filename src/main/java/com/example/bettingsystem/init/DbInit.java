package com.example.bettingsystem.init;

import com.example.bettingsystem.models.entities.Role;
import com.example.bettingsystem.models.entities.User;
import com.example.bettingsystem.models.enums.UserRole;
import com.example.bettingsystem.repository.RoleRepository;
import com.example.bettingsystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DbInit implements CommandLineRunner {


    private RoleRepository roleRepository;
    private UserRepository userRepository;
    private PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {
        if(roleRepository.count() == 0){
            for (UserRole userRole : UserRole.values()) {
                Role role = new Role();
                role.setRole(userRole);
                roleRepository.save(role);
            }
        }
        if(userRepository.count() == 0){
            User user = new User();
            user.setRole(roleRepository.findByRole(UserRole.USER));
            user.setUsername("user");
            user.setPassword(encoder.encode("user"));
            userRepository.save(user);
            User admin = new User();
            admin.setRole(roleRepository.findByRole(UserRole.ADMIN));
            admin.setUsername("admin");
            admin.setPassword(encoder.encode("admin"));
            userRepository.save(admin);
        }


    }
}

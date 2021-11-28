package com.ksv.springboot_project.repos;

import com.ksv.springboot_project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

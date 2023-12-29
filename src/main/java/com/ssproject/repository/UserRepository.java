package com.ssproject.repository;

import com.ssproject.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);
}

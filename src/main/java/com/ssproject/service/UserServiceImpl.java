package com.ssproject.service;

import com.ssproject.model.UserDtls;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDtls createUser(UserDtls user) {
        return null;
    }

    @Override
    public boolean checkEmail(String email) {
        return false;
    }
}

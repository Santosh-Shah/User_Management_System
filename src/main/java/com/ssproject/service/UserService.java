package com.ssproject.service;

import com.ssproject.model.UserDtls;

public interface UserService {
    public UserDtls createUser(UserDtls user);
    public boolean checkEmail(String email);
}

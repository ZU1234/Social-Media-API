package com.core.service;

import com.core.model.UserModel;

import java.util.List;

public interface UserService {
    UserModel save(UserModel user);

    List<UserModel> getAllUsers();

    UserModel findByEmail(String email);


    boolean delete(String id);
}

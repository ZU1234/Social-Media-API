package com.core.dao;

import com.core.model.UserModel;

import java.util.List;

public interface UserDao{

    UserModel save(UserModel user) throws Exception;

    List<UserModel> getAll();
    UserModel findByEmail(String email);

    boolean remove(String id);
}

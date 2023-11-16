package com.facade.facades;

import com.core.model.UserModel;
import com.facade.dto.UserDto;

import java.util.List;

public interface UserFacade {
    void save(UserDto user);

    List<UserModel> getAllUsers();

    UserDto findByEmail(String email);


    boolean delete(String id);
}

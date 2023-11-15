package com.facade.facades;

import com.core.model.UserModel;
import com.facade.dto.UserDto;

import java.util.List;

public interface UserFacade {
    UserDto save(UserModel user);

    List<UserModel> getAllUsers();

    UserDto findByEmail(String email);


    boolean delete(String id);
}

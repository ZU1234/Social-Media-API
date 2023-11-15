package com.facade.facades.impl;

import com.core.model.UserModel;
import com.core.service.UserService;
import com.facade.dto.UserDto;
import com.facade.facades.UserFacade;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFacadeImpl implements UserFacade {
    private final UserService userService;
    private final Converter<UserModel, UserDto>  userConverter;

    public UserFacadeImpl(UserService userService, Converter<UserModel, UserDto> userConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
    }


    @Override
    public UserDto save(UserModel user) {
        return userConverter.convert(userService.save(user));
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public UserDto findByEmail(String email) {
        return userConverter.convert(userService.findByEmail(email));
    }

    @Override
    public boolean delete(String id) {
        return userService.delete(id);
    }
}

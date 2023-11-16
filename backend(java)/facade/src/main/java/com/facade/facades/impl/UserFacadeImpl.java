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
    private final Converter<UserDto,UserModel>  userReverseConverter;

    public UserFacadeImpl(UserService userService, Converter<UserModel, UserDto> userConverter, Converter<UserDto, UserModel> userReverseConverter) {
        this.userService = userService;
        this.userConverter = userConverter;
        this.userReverseConverter = userReverseConverter;
    }


    @Override
    public void save(UserDto user) {
        userService.save(userReverseConverter.convert(user));
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

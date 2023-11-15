package com.facade.converters;

import com.core.model.UserModel;
import com.facade.dto.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserModel, UserDto> {


    @Override
    public UserDto convert(UserModel source) {
        if (source == null) {
            throw new NullPointerException("UserModel null olamaz!");
        }
        UserDto userDto = new UserDto();
        userDto.setEmail(source.getEmail());
        userDto.setFullname(source.getFullname());
        return userDto;
    }
}

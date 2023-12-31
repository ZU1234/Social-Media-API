package com.facade.converters;

import com.core.model.UserModel;
import com.facade.dto.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter implements Converter<UserDto, UserModel> {
    public UserModel convert(UserDto source) {
        UserModel target = new UserModel();
        target.setEmail(source.getEmail());
        target.setFullname(source.getFullname());
        target.setPassword(source.getPassword());
        return target;
    }

    public List<UserModel> convert(List<UserDto> sourceList) {
        return sourceList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}

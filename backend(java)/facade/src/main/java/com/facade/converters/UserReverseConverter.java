package com.facade.converters;

import com.core.model.UserModel;
import com.facade.dto.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserReverseConverter implements Converter<UserModel, UserDto> {
    @Override
    public UserDto convert(UserModel source) {
        UserDto target = new UserDto();
        target.setEmail(source.getEmail());
        target.setFullname(source.getFullname());
        target.setPassword(source.getPassword());
        return target;
    }

    public List<UserDto> convertReverse(List<UserModel> sourceList) {
        return sourceList.stream().map(this::convert).collect(Collectors.toList());
    }
}

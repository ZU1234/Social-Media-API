package com.facade.converters;

import com.core.model.ShareModel;
import com.facade.dto.ShareDto;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShareReverseConverter implements Converter<ShareModel, ShareDto> {
    private final ModelMapper modelMapper;

    public ShareReverseConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ShareDto convert(@NonNull ShareModel source) {
        return modelMapper.map(source, ShareDto.class);
    }


}

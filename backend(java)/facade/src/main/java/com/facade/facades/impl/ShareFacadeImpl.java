package com.facade.facades.impl;

import com.core.model.ShareModel;
import com.core.service.ShareService;
import com.facade.dto.ShareDto;
import com.facade.facades.ShareFacade;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShareFacadeImpl implements ShareFacade {
    private final ModelMapper modelMapper;

    private Converter<ShareModel, ShareDto> converter;
    private Converter<ShareDto, ShareModel> reverseConverter;
    private ShareService shareService;

    public ShareFacadeImpl(ModelMapper modelMapper, Converter<ShareModel, ShareDto> converter, Converter<ShareDto, ShareModel> reverseConverter, ShareService shareService) {
        this.modelMapper = modelMapper;
        this.converter = converter;
        this.reverseConverter = reverseConverter;
        this.shareService = shareService;
    }

    @Override
    public void save(ShareDto share) {
        shareService.save(reverseConverter.convert(share));
    }

    @Override
    public List<ShareDto> getList() {
        return reverseConverter(shareService.getList());
    }
    private List<ShareDto> reverseConverter(List<ShareModel> sourceList) {
        return sourceList.stream()
                .map(userModel -> modelMapper.map(sourceList, ShareDto.class))
                .collect(Collectors.toList());
    }
}

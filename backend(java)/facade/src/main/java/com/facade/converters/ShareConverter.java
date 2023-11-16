package com.facade.converters;

import com.core.model.ShareModel;
import com.core.model.enums.Status;
import com.facade.dto.ShareDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShareConverter implements Converter<ShareDto, ShareModel> {

    @Override
    public ShareModel convert(ShareDto source) {
        ShareModel target = new ShareModel();
        target.setStatus(Status.ACTIVE);
        target.setDescription(source.getDescription());

        return target;
    }

    public List<ShareModel> convert(List<ShareDto> sourceList) {
        return sourceList.stream().map(this::convert).collect(Collectors.toList());
    }


}
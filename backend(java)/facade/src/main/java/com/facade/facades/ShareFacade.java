package com.facade.facades;

import com.core.model.ShareModel;
import com.facade.dto.ShareDto;

import java.util.List;

public interface ShareFacade {
    void save(ShareDto share);

    List<ShareDto> getList();
}

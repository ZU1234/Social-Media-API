package com.core.service;

import com.core.model.ShareModel;

import java.util.List;

public interface ShareService {
    ShareModel save(ShareModel share);

    List<ShareModel> getList();
}

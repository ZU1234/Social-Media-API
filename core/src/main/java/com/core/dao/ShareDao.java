package com.core.dao;

import com.core.model.ShareModel;

import java.util.List;

public interface ShareDao {
    ShareModel save(ShareModel share);

    List<ShareModel> getList();
}

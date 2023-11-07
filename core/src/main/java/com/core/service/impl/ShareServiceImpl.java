package com.core.service.impl;

import com.core.dao.Impl.ShareDaoImpl;
import com.core.model.ShareModel;
import com.core.service.ShareService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShareServiceImpl implements ShareService {
    private ShareDaoImpl shareDaoImpl;

    public ShareServiceImpl(ShareDaoImpl shareDaoImpl) {
        this.shareDaoImpl = shareDaoImpl;
    }

    @Override
    public ShareModel save(ShareModel share) {
        return shareDaoImpl.save(share);
    }

    @Override
    public List<ShareModel> getList() {
        return shareDaoImpl.getList();
    }

}

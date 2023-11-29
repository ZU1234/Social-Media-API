package com.core.dao.Impl;

import com.core.dao.ShareDao;
import com.core.model.ShareModel;
import com.core.repository.ShareRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShareDaoImpl implements ShareDao {
    private final ShareRepository shareRepository;

    public ShareDaoImpl(ShareRepository shareRepository) {
        this.shareRepository = shareRepository;
    }

    @Override
    public ShareModel save(ShareModel share) {
        return shareRepository.insert(share);
    }

    @Override
    public List<ShareModel> getList() {
        return shareRepository.findAll();
    }
}

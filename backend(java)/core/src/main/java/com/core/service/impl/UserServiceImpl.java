package com.core.service.impl;

import com.core.dao.UserDao;
import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserModel save(UserModel user) {
        try {
            return userDao.save(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<UserModel> getAllUsers() {
        return userDao.getAll();
    }
    @Override
    public UserModel findByEmail(String email) {
        return userDao.findByEmail(email);
    }
    @Override
    public boolean delete(String id) {
        return userDao.remove(id);
    }
}

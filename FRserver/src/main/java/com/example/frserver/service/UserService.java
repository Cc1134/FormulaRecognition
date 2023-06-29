package com.example.frserver.service;

import com.example.frserver.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public long getCount() {
        return userDao.getCount();
    }
}

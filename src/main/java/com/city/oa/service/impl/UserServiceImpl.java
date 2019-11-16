package com.city.oa.service.impl;

import com.city.oa.bean.User;
import com.city.oa.mapper.UserMapper;
import com.city.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}

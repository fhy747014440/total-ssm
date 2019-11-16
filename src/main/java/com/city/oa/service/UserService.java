package com.city.oa.service;


import com.city.oa.bean.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User getById(Integer id);


}

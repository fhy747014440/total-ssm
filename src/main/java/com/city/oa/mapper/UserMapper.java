package com.city.oa.mapper;

import com.city.oa.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from tb_user")
    public List<User> getAll();

    public User getById(Integer id);

}

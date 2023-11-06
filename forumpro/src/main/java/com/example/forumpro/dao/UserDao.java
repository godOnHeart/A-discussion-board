package com.example.forumpro.dao;

import com.example.forumpro.daomain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("SELECT * from users where user_id= #{userId}")
    public User getUserById(String userId);


}

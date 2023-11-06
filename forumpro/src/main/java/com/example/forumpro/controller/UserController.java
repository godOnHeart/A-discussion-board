package com.example.forumpro.controller;

import com.example.forumpro.dao.UserDao;
import com.example.forumpro.daomain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public boolean login(String userId, String passwd){
        System.out.println("UserId------>"+userId);
        System.out.println("passwd-------->"+passwd);
        User user=userDao.getUserById(userId);
        System.out.println("User---->"+user);
        if(user.getPassword().equals(passwd)) return true;
        else return false;
    }

}

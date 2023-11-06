package com.example.forumpro.controller;


import com.example.forumpro.dao.CommentDao;
import com.example.forumpro.daomain.Comment;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 这是关于问题回复的连接
 */
@Controller
@RestController
public class CommentController {
    @Autowired
    CommentDao commentDao;

    @RequestMapping("/getAllRe")
    public List<Comment> getAllRe(String messageId){
        List<Comment> list=commentDao.getAllRe(messageId);
        return list;
    }

    @RequestMapping("/addRe")
    public void addRe(Comment comment){
        commentDao.addRe(comment);
    }


}

package com.example.forumpro;

import com.example.forumpro.dao.CommentDao;
import com.example.forumpro.dao.MessageDao;
import com.example.forumpro.dao.UserDao;
import com.example.forumpro.daomain.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ForumproApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    MessageDao messageDao;


    @Test
    public void test(){
        System.out.println(messageDao.getAllMessage());
    }
    @Test
    public void testadd(){


    }

    @Autowired
    CommentDao commentDao;
    @Test
    public void getAllRe(){
//        System.out.println(commentDao.getAll());
//        System.out.println(commentDao.getAllRe("1"));
        Comment comment=new Comment();
        comment.setUserId("User111");
        comment.setMessageId("1");
        comment.setCommentText("回答3");
        comment.setCreationDate(new Date());


        commentDao.addRe(comment);
    }

}

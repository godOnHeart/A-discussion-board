package com.example.forumpro.controller;

import com.example.forumpro.dao.MessageDao;
import com.example.forumpro.daomain.Message;
import com.example.forumpro.daomain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RestController
public class MessageController {
    @Autowired
    MessageDao messageDao;

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

    @RequestMapping("/getAllMessage")
    public List<Message> getAllMessage(){
        List<Message> list=messageDao.getAllMessage();
        System.out.println("List------>"+list);
        return list;
    }

    @RequestMapping("/addMessage")
    public List<Message> addMessage( Message message){
        System.out.println("message=====>"+message);
        messageDao.addMessage(message);
        List<Message> list=messageDao.getAllMessage();
        return list;
    }


}

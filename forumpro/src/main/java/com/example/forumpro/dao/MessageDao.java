package com.example.forumpro.dao;

import com.example.forumpro.daomain.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 这是关于问题的类
 * userId是提出问题的人，messageText是问题内容
 * 添加问题
 * 搜索问题
 *显示问题
 * **/
@Mapper
public interface MessageDao {
//    将问题存储到数据库
    @Insert("INSERT INTO messages (user_id, message_text, creation_date) VALUES (#{userId}, #{messageText}, #{creationDate})")
    public void addMessage(Message message);

    @Select("select * from messages")
    public List<Message> getAllMessage();

    @Select("Select * from messages where message_Id=#{messageId}}")
    public Message getByMessageId(String messageId);

}

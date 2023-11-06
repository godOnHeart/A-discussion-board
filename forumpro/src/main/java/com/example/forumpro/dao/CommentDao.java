package com.example.forumpro.dao;

import com.example.forumpro.daomain.Comment;
import com.example.forumpro.daomain.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *这是一个管理问题回复的Dao
 *根据messageId搜索所有的问题回复，并且按照时间顺序排列；
 *
**/

@Mapper
public interface CommentDao {
    @Select("SELECT * from comments where message_id=#{messageId} ORDER BY creation_date ASC")
    public List<Comment> getAllRe(String messageId);

    @Select("SELECT * from comments")
    public List<Comment> getAll();

    @Insert("INSERT INTO comments (user_id, message_id,comment_text, creation_date) VALUES (#{userId}, #{messageId},#{commentText},#{creationDate})")
    public void addRe(Comment comment);
}

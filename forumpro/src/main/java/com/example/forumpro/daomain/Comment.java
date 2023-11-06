package com.example.forumpro.daomain;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private String commentId;
    private String userId;
    private String messageId;
    private String commentText;
    private Date creationDate;

}

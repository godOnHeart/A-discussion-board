package com.example.forumpro.daomain;

import lombok.Data;

@Data
public class Likes {
    private String likeId;
    private String userId;
    private String messageId;
    private String commentId;
}

package com.example.forumpro.daomain;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.ibatis.annotations.Result;

import java.sql.Timestamp;
import java.util.Date;
import java.util.TimerTask;

@Data
public class Message {
    private String messageId;
    private String userId;
    private String messageText;
    private Date creationDate;

}

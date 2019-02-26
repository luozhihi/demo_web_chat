package com.demo.demo_web.common;

import com.demo.demo_web.entity.User;

import java.util.Date;

public class Message {
    private User send;
    private String message;
    private Date date;

    public User getSend() {
        return send;
    }

    public void setSend(User send) {
        this.send = send;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "send=" + send +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.io.Serializable;

/**
 *
 * @author Luchn1k
 */
public class Chat implements Serializable{
    String message;
    User sender;
    User resiver;

    public Chat(String message, User sender, User resiver) {
        this.message = message;
        this.sender = sender;
        this.resiver = resiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getResiver() {
        return resiver;
    }

    public void setResiver(User resiver) {
        this.resiver = resiver;
    }
    
}

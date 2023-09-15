/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.io.Serializable;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Luchn1k
 */
public abstract class User implements Serializable{

    private String name;
    private String contactNumber;
    private String email;
    private String username;
    private String password;
    private String type;

    protected final ChatRoomComponent mediator;

    public User(String name, String contactNumber, String email, String username, String password, String type, ChatRoomComponent mediator) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.username = username;
        this.password = password;
        this.type = type;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void send(String msg, String userId, String resiverId, StyledDocument doc);

    public abstract void receive(String msg, StyledDocument doc);

    @Override
    public String toString() {
      return this.getContactNumber();
    }
    

}

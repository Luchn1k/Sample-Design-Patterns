/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Luchn1k
 */
public interface ChatRoomComponent extends Serializable {

    public void sendMessage(String msg, String userId, String resiverId, StyledDocument doc);

    public void addUser(User user);

    public Map<String, User> getUserList();

    public String validate(String msg);

    public ArrayList<Chat> getCHAT_ARRAY();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.awt.Color;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Luchn1k
 */
public class Seller extends User {

    public Seller(String name, String contactNumber, String email, String username, String password, String type, ChatRoomComponent mediator) {
        super(name, contactNumber, email, username, password, type, mediator);
    }

    @Override
    public void send(String msg, String userId, String resiverId, StyledDocument doc) {
        msg = mediator.validate(msg);
        mediator.sendMessage(msg, userId, resiverId, doc);
    }

    @Override
    public void receive(String msg, StyledDocument doc) {
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setForeground(right, Color.WHITE);
        try {
            doc.insertString(doc.getLength(), "\n" + msg, right);
            doc.setParagraphAttributes(doc.getLength(), 1, right, false);
        } catch (BadLocationException e) {
        }
    }

}

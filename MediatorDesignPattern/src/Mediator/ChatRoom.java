/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Luchn1k
 */
public class ChatRoom implements ChatRoomComponent{

    private final Map<String, User> USER_MAP = new HashMap();
    private final ArrayList<Chat> CHAT_ARRAY = new ArrayList();
    private static ChatRoom chatRoom;

    @Override
    public void sendMessage(String msg, String userId, String resiverId, StyledDocument doc) {
        User u = USER_MAP.get(userId);
        User u2 = USER_MAP.get(resiverId);
        u.receive(msg, doc);
        Chat chat = new Chat(msg, u, u2);
        CHAT_ARRAY.add(chat);
        System.out.println(CHAT_ARRAY.toString());
        serialize();
    }

    @Override
    public void addUser(User user) {
        this.USER_MAP.put(user.toString(), user);
        serialize();
    }

    @Override
    public Map<String, User> getUserList() {
        return USER_MAP;
    }

    public static ChatRoom getChatRoom() {
        if (chatRoom == null) {
            File file = new File("src/tmp/chat.ser");
            if (file.exists()) {
                deserialize();
            } else {
                chatRoom = new ChatRoom();
            }
        }
        System.out.println(chatRoom.USER_MAP.size());
        return chatRoom;
    }

    private ChatRoom() {
        deserialize();
    }

    private void serialize() {
        try {
            File folder = new File("src/tmp");
            File file = new File("src/tmp/chat.ser");
            if (!folder.exists()) {
                folder.mkdir();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fileOut = new FileOutputStream(file); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        try {
            File file = new File("src/tmp/chat.ser");
            if (!file.exists()) {
                return;
            }
            try (FileInputStream fileIn = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(fileIn)) {
                chatRoom = (ChatRoom) in.readObject();
              
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String validate(String msg) {
        String[] data = msg.split(" ");
        System.out.println("Here");
        for (String s : data) {
            if (s.matches("^\\d{10}$")) {
                msg = "[removed] Message Contains a mobile Number.";
            } else if (s.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
                msg = "[removed] Message Contains a Email.";
            }
        }
        return msg;
    }

    @Override
    public ArrayList<Chat> getCHAT_ARRAY() {
        deserialize();
        return CHAT_ARRAY;
    }
   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Luchn1k
 */
public class Details {

    private final JTextField name;
    private final JTextField mobile;
    private final JPasswordField password;
    private final JTextField email;
    private final JComboBox type;
    private final JTextField username;
    private final JFrame frame;
    private boolean isCompleteSuccessfuly = false;

    public Details(JTextField name, JTextField mobile, JPasswordField password, JTextField email, JComboBox country, JFrame frame, JTextField username) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
        this.type = country;
        this.frame = frame;
        this.username = username;
    }

    public JComboBox getType() {
        return type;
    }

    public JTextField getUsername() {
        return username;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getMobile() {
        return mobile;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JTextField getEmail() {
        return email;
    }

    public boolean isIsCompleteSuccessfuly() {
        return isCompleteSuccessfuly;
    }

    protected void setIsCompleteSuccessfuly(boolean isCompleteSuccessfuly) {
        this.isCompleteSuccessfuly = isCompleteSuccessfuly;
    }

}

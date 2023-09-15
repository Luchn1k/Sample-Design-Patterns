/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Luchn1k
 */
public class ValidatePassword extends Validation {

    @Override
    public void validate(Details detail) {
        String password = detail.getPassword().getText().replace("Enter Your Password...", "").trim();
        Border border;
        Color color;
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        if (password.isEmpty()) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getPassword().setBorder(border);
            detail.getPassword().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/password.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Need a password to register", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else if (!password.matches(regex)) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getPassword().setBorder(border);
            detail.getPassword().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/password.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Password need minimum eight characters, at least one uppercase letter,"
                    + " one lowercase letter, one number and one special character", 
                    "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else {
            color = new Color(80, 200, 90);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getPassword().setBorder(border);
            this.getNext().validate(detail);
        }
    }

}

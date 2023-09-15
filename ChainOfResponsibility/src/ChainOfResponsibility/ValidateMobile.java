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
public class ValidateMobile extends Validation {

    @Override
    public void validate(Details detail) {
        String mobile = detail.getMobile().getText().replace("Enter Your Mobile...", "").trim();
        Border border;
        Color color;
        String rejexPattern = "^\\d{10}$";
        if (mobile.isEmpty()) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getMobile().setBorder(border);
            detail.getMobile().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/mobile.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Need a mobile number to register", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else if (!mobile.matches(rejexPattern)) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getMobile().setBorder(border);
            detail.getMobile().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/mobile.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Mobile number can only contain 10 numbers", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else {
            color = new Color(80, 200, 90);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getMobile().setBorder(border);
            this.getNext().validate(detail);
        }
    }

}

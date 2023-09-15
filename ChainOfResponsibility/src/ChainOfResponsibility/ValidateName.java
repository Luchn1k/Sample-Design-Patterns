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
public class ValidateName extends Validation {

    @Override
    public void validate(Details detail) {
        String name = detail.getName().getText().replace("Enter Your Name...", "").trim();
        Border border;
        Color color;
        if (name.isEmpty()) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getName().setBorder(border);
            detail.getName().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/name.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Need a name to register", "Error", JOptionPane.ERROR_MESSAGE, icon);

        } else {
            color = new Color(80, 200, 90);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getName().setBorder(border);
            this.getNext().validate(detail);
        }
    }

}

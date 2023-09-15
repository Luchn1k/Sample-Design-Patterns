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
public class TypeValidation extends Validation {

    @Override
    public void validate(Details detail) {
        String country = detail.getType().getSelectedItem().toString().replace("Select Type...", "").trim();
        Border border;
        Color color;
        if (country.isEmpty()) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getType().setBorder(border);
            detail.getType().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/seller.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Select A type", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else {
            color = new Color(80, 200, 90);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getType().setBorder(border);
            detail.setIsCompleteSuccessfuly(true);
        }
    }

}

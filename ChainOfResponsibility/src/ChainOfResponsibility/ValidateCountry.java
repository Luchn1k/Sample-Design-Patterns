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
public class ValidateCountry extends Validation {

    @Override
    public void validate(Details detail) {
        String country = detail.getCountry().getSelectedItem().toString().replace("Select Your Country...", "").trim();
        Border border;
        Color color;
        if (country.isEmpty()) {
            color = new Color(184, 15, 10);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getCountry().setBorder(border);
            detail.getCountry().requestFocus();
            ImageIcon icon = new ImageIcon("src/images/country.png");
            JOptionPane.showMessageDialog(detail.getFrame(), "Select a country to register", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else {
            color = new Color(80, 200, 90);
            border = BorderFactory.createLineBorder(color, 1);
            detail.getCountry().setBorder(border);
            detail.setIsCompleteSuccessfuly(true);
        }
    }

}

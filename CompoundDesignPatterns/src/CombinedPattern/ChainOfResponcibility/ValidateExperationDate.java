/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.ChainOfResponcibility;

import java.util.Date;

/**
 *
 * @author Luchn1k
 */
public class ValidateExperationDate extends Validation {

    @Override
    public boolean validate(ValidationDetails detail) {
        if (detail.getExpDate().after(new Date())) {
            return this.getNext().validate(detail);
        }
        return false;
    }

}

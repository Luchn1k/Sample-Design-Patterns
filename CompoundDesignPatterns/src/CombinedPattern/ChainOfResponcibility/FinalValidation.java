/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.ChainOfResponcibility;

/**
 *
 * @author Luchn1k
 */
public class FinalValidation extends Validation {

    @Override
    public boolean validate(ValidationDetails detail) {
        if (detail.isAccountStatus()) {
            return true;
        }
        return false;
    }

}

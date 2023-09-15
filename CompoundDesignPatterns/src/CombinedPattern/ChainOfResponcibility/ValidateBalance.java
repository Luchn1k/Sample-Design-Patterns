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
public class ValidateBalance extends Validation {

    private final double BANK_THRESHOLD = 1000;

    @Override
    public boolean validate(ValidationDetails detail) {
        if (detail.getAvilableMoney() + BANK_THRESHOLD >= detail.getRequestedMoney()) {
            return this.getNext().validate(detail);
        }
        return false;
    }

}

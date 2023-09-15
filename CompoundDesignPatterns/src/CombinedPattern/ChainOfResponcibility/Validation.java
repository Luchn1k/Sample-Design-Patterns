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
public abstract class Validation {

    private Validation validation;

    public void setNext(Validation validation) {
        this.validation = validation;
    }

    protected Validation getNext() {
        return validation;
    }

    public abstract boolean validate(ValidationDetails detail);
}

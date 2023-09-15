/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author Luchn1k
 */
public class Number implements Expression {

    private String number;

    public Number(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return Double.parseDouble(number);
    }

}

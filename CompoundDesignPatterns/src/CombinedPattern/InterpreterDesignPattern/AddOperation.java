/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.InterpreterDesignPattern;

/**
 *
 * @author Luchn1k
 */
public class AddOperation implements Expression {

    private Expression number1;
    private Expression number2;

    public AddOperation(Expression number1, Expression number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNumber1(Expression number1) {
        this.number1 = number1;
    }

    public void setNumber2(Expression number2) {
        this.number2 = number2;
    }

    @Override
    public double interpret() {
        return number1.interpret() + number2.interpret();
    }
}

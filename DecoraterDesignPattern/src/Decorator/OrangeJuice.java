/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Luchn1k
 */
public class OrangeJuice implements FruitJuice{
    private final double PRICE = 100;
    private final String DESCRIPTION = "Orange Juice";
    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getDescription() {
       return DESCRIPTION;
    }
    
}

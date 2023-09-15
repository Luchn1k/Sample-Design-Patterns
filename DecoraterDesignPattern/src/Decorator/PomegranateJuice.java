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
public class PomegranateJuice implements FruitJuice{
    private final double PRICE = 250;
    private final String DESCRIPTION = "Pomegranate Juice";
    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getDescription() {
       return DESCRIPTION;
    }
}

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
public abstract class Toppings implements FruitJuice{
    private final FruitJuice FRUIT_JUICE;
    
    public Toppings(FruitJuice fruitJuice){
        this.FRUIT_JUICE = fruitJuice;
    }

    @Override
    public double getPrice() {
       return FRUIT_JUICE.getPrice();
    }

    @Override
    public String getDescription() {
       return FRUIT_JUICE.getDescription()+"\nAdded ";
    }
    
}

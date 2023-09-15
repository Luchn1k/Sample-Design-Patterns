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
public class CashewNut extends Toppings {

    private final double PRICE = 10;
    private final String DESCRIPTION = "Cashew Nut";

    public CashewNut(FruitJuice fruitJuice) {
        super(fruitJuice);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + PRICE;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + DESCRIPTION;
    }

}

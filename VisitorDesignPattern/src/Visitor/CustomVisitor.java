/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Luchn1k
 */
public class CustomVisitor implements Visitor.CartVisitor {

    @Override
    public double visit(GameConsole gameConsole) {
        return ((gameConsole.getPrice() * Double.valueOf(gameConsole.getAddedCount())) + gameConsole.getDelivery());
    }

    @Override
    public double visit(Laptop laptop) {
        return ((laptop.getPrice() * Double.valueOf(laptop.getAddedCount())) + laptop.getDelivery());
    }

    @Override
    public double visit(Mouse mouse) {
        return ((mouse.getPrice() * Double.valueOf(mouse.getAddedCount())) + mouse.getDelivery());
    }

    @Override
    public double visit(SmartWatch smartWatch) {
        return ((smartWatch.getPrice() * Double.valueOf(smartWatch.getAddedCount())) + smartWatch.getDelivery());
    }

}

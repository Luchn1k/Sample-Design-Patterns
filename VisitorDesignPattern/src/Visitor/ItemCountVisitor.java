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
public class ItemCountVisitor implements Visitor.CartVisitor {

    @Override
    public double visit(GameConsole gameConsole) {
        return gameConsole.getAddedCount();
    }

    @Override
    public double visit(Laptop laptop) {
        return laptop.getAddedCount();
    }

    @Override
    public double visit(Mouse mouse) {
        return mouse.getAddedCount();
    }

    @Override
    public double visit(SmartWatch smartWatch) {
        return smartWatch.getAddedCount();
    }

}

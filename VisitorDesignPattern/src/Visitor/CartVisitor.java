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
public interface CartVisitor {
    public double visit(GameConsole gameConsole);
    public double visit(Laptop laptop);
    public double visit(Mouse mouse);
    public double visit(SmartWatch smartWatch);
    
}

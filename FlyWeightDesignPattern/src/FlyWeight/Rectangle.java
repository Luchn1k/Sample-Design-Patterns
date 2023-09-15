/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyWeight;


import java.awt.Graphics;

/**
 *
 * @author Luchn1k
 */
public class Rectangle extends Shape {

    public Rectangle(String label, Graphics g) {
        super(label, g);
    }

    @Override
    public void draw() {
        getG().setColor(getColor());
        getG().fillRect(getX(), getY(), getWidth(), getHeight());

    }
}

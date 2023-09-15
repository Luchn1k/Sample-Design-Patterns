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
public class Triangle extends Shape {
    
    public Triangle(String label, Graphics g) {
        super(label, g);
    }
    
    @Override
    public void draw() { 
        int[] x = {getX(), getX()-(getWidth()/2), getX()+(getWidth()/2)};
        int[] y = {getY(), getY() + getHeight(), getY() + getHeight()};
        getG().setColor(getColor());
        getG().fillPolygon(x, y, 3);    
    }
    
}

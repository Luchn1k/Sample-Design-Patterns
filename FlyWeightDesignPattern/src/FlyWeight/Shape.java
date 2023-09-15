/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyWeight;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Luchn1k
 */
public abstract class Shape {

    private int x = 10;
    private int y = 10;
    private int width = 10;
    private int height = 10;
    private Color color = Color.BLACK;
    private final String label;
    private final Graphics g;

    public Shape(String label, Graphics g) {
        this.label = label;
        this.g = g;
    }

    public Graphics getG() {
        return g;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public String getLabel() {
        return label;
    }

    public abstract void draw();
}

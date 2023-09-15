/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyWeight;

import java.awt.Graphics;
import java.util.HashMap;

/**
 *
 * @author Luchn1k
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> POOL = new HashMap<>();

    public static Shape getShape(String label, Graphics g) {
        Shape concreteShape = (Shape) POOL.get(label);

        if (concreteShape == null) {
            switch (label) {
                case "Rectangle":
                    concreteShape = new Rectangle(label, g);
                    break;
                case "Oval":
                    concreteShape = new Oval(label, g);
                    break;
                case "triangle":
                    concreteShape = new Triangle(label, g);
                    break;
                default:
                    break;
            }
            POOL.put(label, concreteShape);
        }
        return concreteShape;
    }
    public static int getSize(){
        return POOL.size();
    }
}

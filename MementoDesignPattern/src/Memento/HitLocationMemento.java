/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.awt.Rectangle;

/**
 *
 * @author Luchn1k
 */
public class HitLocationMemento {

    private final Rectangle hitLocation;
    private final Rectangle targetLocation;

    public HitLocationMemento(Rectangle hitLocation, Rectangle targetLocation) {
        this.hitLocation = hitLocation;
        this.targetLocation = targetLocation;
    }

    public Rectangle getHitLocation() {
        return hitLocation;
    }

    public Rectangle getTargetLocation() {
        return targetLocation;
    }
}

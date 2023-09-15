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
public class HitLocation {

    private Rectangle hitLocation;
    private Rectangle targetLocation;

    private final HitLocationCaretaker caretaker = new HitLocationCaretaker();

    public HitLocation(Rectangle hitLocation, Rectangle targetLocation) {
        this.hitLocation = hitLocation;
        this.targetLocation = targetLocation;

    }

    public void setHitLocation(Rectangle hitLocation) {
        this.hitLocation = hitLocation;
    }

    public void setTargetLocation(Rectangle targetLocation) {
        this.targetLocation = targetLocation;
    }

    public Rectangle getHitLocation() {
        return hitLocation;
    }

    public Rectangle getTargetLocation() {
        return targetLocation;
    }

    public void save() {
        caretaker.addMemento(new HitLocationMemento(hitLocation, targetLocation));
    }

    public void undo() {
        HitLocationMemento mememto = caretaker.getMemento();
        if (mememto != null) {
            setHitLocation(mememto.getHitLocation());
            setTargetLocation(mememto.getTargetLocation());
        }

    }

}

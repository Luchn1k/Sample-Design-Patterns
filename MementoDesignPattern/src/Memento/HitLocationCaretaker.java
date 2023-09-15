/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Stack;

/**
 *
 * @author Luchn1k
 */
public class HitLocationCaretaker {

    private final Stack<HitLocationMemento> HITLOCATION_LIST = new Stack();

    public void addMemento(HitLocationMemento memento) {
        HITLOCATION_LIST.push(memento);
    }

    public HitLocationMemento getMemento() {
        if (!HITLOCATION_LIST.isEmpty()) {
            return HITLOCATION_LIST.pop();
        }
        return null;
    }
}

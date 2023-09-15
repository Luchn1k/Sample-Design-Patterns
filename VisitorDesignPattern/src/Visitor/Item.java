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
public interface Item {
    public double accept(CartVisitor visitor);
}


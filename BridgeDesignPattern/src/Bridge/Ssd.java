/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Luchn1k
 */
public class Ssd extends Specs{

    public Ssd(String name) {
        super(name);
    }

    @Override
    public String work() {
       return "A SSD (Solid State Drive) is a solid-state storage device that uses integrated circuit assemblies to store data persistently";
    }
    
}

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
public class Laptop extends Device{

    public Laptop(Specs brand, Specs model, Specs ram, Specs gpu, Specs ssd) {
        super(brand, model, ram, gpu, ssd);
    }

    @Override
    public String description() {
        return "A laptop, laptop computer, or notebook computer is a small, portable personal computer (PC) with a screen and alphanumeric keyboard.";
    }
    
}

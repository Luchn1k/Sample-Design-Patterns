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
public class DesktopPC extends Device{

    public DesktopPC(Specs brand, Specs model, Specs ram, Specs gpu, Specs ssd) {
        super(brand, model, ram, gpu, ssd);
    }

    @Override
    public String description() {
       return "A desktop computer is a personal computing device designed to fit on top of a typical office desk. It houses the physical hardware that makes a computer run and connects to input devices such as the monitor, keyboard and mouse users interact with.";
    }
    
}

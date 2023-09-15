/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import java.util.Arrays;

/**
 *
 * @author Luchn1k
 */
public abstract class Device {

    private final Specs[] specList;
    private final int BRAND = 0;
    private final int MODEL = 1;
    private final int RAM = 2;
    private final int GPU = 3;
    private final int SSD = 4;

    public Device(Specs brand, Specs model, Specs ram, Specs gpu, Specs ssd) {
        this.specList = new Specs[5];
        specList[BRAND] = brand;
        specList[MODEL] = model;
        specList[RAM] = ram;
        specList[GPU] = gpu;
        specList[SSD] = ssd;
    }
    public Specs getBrand(){
        return specList[BRAND];
    }
    public Specs getModel(){
        return specList[MODEL];
    }
    public Specs getRam(){
        return specList[RAM];
    }
    public Specs getGpu(){
        return specList[GPU];
    }
    public Specs getSSD(){
        return specList[SSD];
    }
    public abstract String description();
}

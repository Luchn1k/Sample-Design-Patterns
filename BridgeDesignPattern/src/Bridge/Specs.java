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
public abstract class Specs {
    protected String name;
    public Specs(String name){
        this.name = name;
    }
    public abstract String work();
    
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name == null ? "N/A" : name;
    }

  
    
}

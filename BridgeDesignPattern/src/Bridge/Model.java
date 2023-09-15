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
public class Model extends Specs{

    public Model(String name) {
        super(name);
    }

    @Override
    public String work() {
        return "Model is a unique number given to each product made by computer hardware manufacturers";
    }
    
}

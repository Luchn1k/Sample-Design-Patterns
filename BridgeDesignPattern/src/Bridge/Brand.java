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
public class Brand extends Specs{

    public Brand(String name) {
        super(name);
    }

    @Override
    public String work() {
        return "A brand name identifies a specific company, product or service and differentiates it from similar brands within a category";
    }
    
}

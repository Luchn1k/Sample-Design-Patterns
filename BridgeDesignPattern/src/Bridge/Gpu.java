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
public class Gpu extends Specs{

    public Gpu(String name) {
        super(name);
    }

    @Override
    public String work() {
       return "GPU (Graphics Processing Unit) is a specialized processor originally designed to accelerate graphics rendering. GPUs can process many pieces of data simultaneously, making them useful for machine learning, video editing, and gaming applications.";
    }
    
    
}

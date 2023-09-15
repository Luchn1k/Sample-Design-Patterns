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
public class Ram extends Specs{

    public Ram(String name) {
        super(name);
    }

    @Override
    public String work() {
        return "RAM (Random Access Memory) is volatile memory that temporarily stores the files you are working on.";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Luchn1k
 */
public class File extends AbstractStructure{

    
    public File(String name,double size){
        this.name = name;
        this.size = size;
    }
    @Override
    public double getSize() {
       return size;
    }

    @Override
    public int getFileCount() {
       return 0;
    }

    @Override
    public int getDirectoryCount() {
        return 0;
    }

   

   
}

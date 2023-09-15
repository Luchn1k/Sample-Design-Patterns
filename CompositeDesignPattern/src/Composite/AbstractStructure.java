/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Luchn1k
 */
public abstract class AbstractStructure extends DefaultMutableTreeNode {

    protected String name;
    protected double size;
    protected int folderCount = 0;
    protected int fileCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSize();
    public abstract int getFileCount();
    public abstract int getDirectoryCount();

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isLeaf() {
      return this.getClass().toString().contains("File") ;
    }
    

}

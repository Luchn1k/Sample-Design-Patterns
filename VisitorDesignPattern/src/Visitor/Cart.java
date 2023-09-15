/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;

/**
 *
 * @author Luchn1k
 */
public class Cart {

    ArrayList<Item> itemList = new ArrayList();

    public double checkOut(CartVisitor visitor) {
        double total = 0;
        ArrayList<Item> removeList = new ArrayList();
        for (Item i : itemList) {
            total += i.accept(visitor);
            removeList.add(i);
        }
        itemList.removeAll(removeList);
        return total;
    }

    public void addToCart(Item item) {
        itemList.add(item);
    }

    public int getCartCount(CartVisitor visitor) {
        int count = 0;
        for (Item i : itemList) {
            count += i.accept(visitor);
        }
        return count;
    }

    public boolean getIsInCart(Item item) {
        boolean isIn = false;
        for (Item i : itemList) {
            if (i == item) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public double calculateCartTotal(CartVisitor visitor) {
        double total = 0;
        for (Item i : itemList) {
            total += i.accept(visitor);
        }
        return total;
    }

    public String[][] getDescription() {
        String[][] returnString = new String[itemList.size()][8];
        for (int i = 0; i < itemList.size(); i++) {
            String temp = itemList.get(i).toString();
            String[] tempArray = temp.split(",");
            for (int j = 0; j < tempArray.length; j++) {
                returnString[i][j] = tempArray[j];
            }
        }
        return returnString;
    }

}

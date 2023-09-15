/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Luchn1k
 */
public class GameConsole implements Item {

    private String brand;
    private String model;
    private String Ram;
    private String grapics;
    private double price;
    private double delivery;
    private int quantity;
    private int addedCount;
    private String imagePath;

    public GameConsole(String brand, String model, String Ram, String grapics, double price, double delivery, int quantity, String imagePath) {
        this.brand = brand;
        this.model = model;
        this.Ram = Ram;
        this.grapics = grapics;
        this.price = price;
        this.delivery = delivery;
        this.quantity = quantity;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAddedCount() {
        return addedCount;
    }

    public void setAddedCount(int addedCount) {
        this.addedCount = addedCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getGrapics() {
        return grapics;
    }

    public void setGrapics(String grapics) {
        this.grapics = grapics;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }

    @Override
    public double accept(CartVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
       return "Game Console,"+ brand + "," + model + "," + Ram + "," + grapics + ",Rs. " + price + ",Rs. " + delivery + "," + addedCount;
    }
    

}

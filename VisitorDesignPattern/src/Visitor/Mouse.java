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
public class Mouse implements Item {

    private String brand;
    private String model;
    private String type;
    private String button;
    private double price;
    private double delivery;
    private int quantity;
    private int addedCount;
    private String imagePath;

    public Mouse(String brand, String model, String type, String button, double price, double delivery, int quantity, String imagePath) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.button = button;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
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
        return "Mouse,"+ brand + "," + model + "," + type + "," + button + ",Rs. " + price + ",Rs. " + delivery + "," + addedCount;
    }

}

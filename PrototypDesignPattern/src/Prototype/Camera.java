/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.text.DecimalFormat;

/**
 *
 * @author Luchn1k
 */
public class Camera implements CameraPrototype {

    private String brand;
    private String model;
    private String type;
    private double sensor;
    private double imageSensor;
    private String videoResolution;
    private String Storage;
    private boolean flash;
    private boolean LCD;
    DecimalFormat df = new DecimalFormat("##.##");

    public Camera(String brand, String model, String type, double sensor, double imageSensor, String videoResolution, String Storage, boolean flash, boolean LCD) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.sensor = sensor;
        this.imageSensor = imageSensor;
        this.videoResolution = videoResolution;
        this.Storage = Storage;
        this.flash = flash;
        this.LCD = LCD;
    }

    public boolean isLCD() {
        return LCD;
    }

    public void setLCD(boolean LCD) {
        this.LCD = LCD;
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

    public double getSensor() {
        return sensor;
    }

    public void setSensor(double sensor) {
        this.sensor = sensor;
    }

    public double getImageSensor() {
        return imageSensor;
    }

    public void setImageSensor(double imageSensor) {
        this.imageSensor = imageSensor;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public boolean isFlash() {
        return flash;
    }

    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    @Override
    public Camera clone() {
        return new Camera(brand, model, type, sensor, imageSensor, videoResolution, Storage, flash, LCD);
    }

    @Override
    public String toString() {

        String splitValue = Storage.contains("GB") ? "GB" : "MB";
        return "Brand : " + brand + "\n"
                + "Model : " + model + "\n"
                + "Type : " + type + "\n"
                + "Sensor : " + sensor + " inch\n"
                + "Image Sensor : " + imageSensor + " MP\n"
                + "Video Resolution : " + df.format(Double.valueOf(videoResolution.split(" ")[0])) + " " + videoResolution.split(" ")[1].trim() + "\n"
                + "Storage : " + df.format(Double.valueOf(Storage.split(splitValue)[0].trim())) + " " + splitValue + " " + Storage.split(splitValue)[1].trim() + "\n"
                + "Flash : " + (flash ? "Available" : "Unavailable") + "\n"
                + "LCD : " + (LCD ? "Available" : "Unavailable");

    }

}

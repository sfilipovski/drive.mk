package com.example.car_project.Domain;

import java.io.Serializable;

public class CarDomain implements Serializable {
    private String title;
    private String description;
    private String picUrl;
    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    private String enginePower;
    private String topspeed;
    private double price;
    private double rating;

    public CarDomain() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getTotalCapacity() {
        return capacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        this.capacity = totalCapacity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getTopSpeed() {
        return topspeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topspeed = topSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

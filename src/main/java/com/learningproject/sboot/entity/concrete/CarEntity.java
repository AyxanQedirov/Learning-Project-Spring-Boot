package com.learningproject.sboot.entity.concrete;


import com.learningproject.sboot.entity.abstracts.Entity;

public class CarEntity implements Entity {

    private int id ;
    private String name;
    private double priceForOneHour;
    private String color;
    private String fuelType;

    public CarEntity(int id, String name, double priceForOneHour, String color,String fuelType) {
        this.id = id;
        this.name = name;
        this.priceForOneHour = priceForOneHour;
        this.color = color;
        this.fuelType=fuelType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceForOneHour() {
        return priceForOneHour;
    }

    public String getColor() {
        return color;
    }
    public String getFuelType(){
        return fuelType;
    }






}

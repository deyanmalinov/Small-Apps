package com.DPM;

import java.io.Serializable;
import java.util.Scanner;
public class CarShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Koli seat = new Seat("Leon", "gray", 110, "Spain");
        System.out.println(seat.toString());
    }
}

interface Koli {
    int TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
}


class Seat implements Koli, Serializable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    public Seat(String model, String color, Integer horsePower,String countryProduced){
        this.countryProduced=countryProduced;
        this.model=model;
        this.color=color;
        this.horsePower=horsePower;
    }
    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public Integer getHorsePower() {
        return horsePower;
    }
    @Override
    public String toString() {
        return String.format("%s is %s and have %d horse powers\nThis is %s produced in %s and have %d tires",
                this.getModel(), this.getColor(), this.getHorsePower(), this.getModel(), this.countryProduced, TIRES);
    }
}
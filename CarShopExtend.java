package com.DPM;
import java.util.Scanner;
public class CarShopExtend {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Sellable seat = new Seat2("Leon",
                "gray",
                110,
                "Spain",
                11111.1);

        Rentable audi = new Audi("Leon",
                "gray",
                110,
                "Spain",
                3,
                99.9);

        System.out.println(seat.toString());

        System.out.println(audi.toString());
    }
}

interface Cars2 {
    int TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
}
interface Sellable extends Koli {
    Double getPrice();
}
interface Rentable extends Koli {
    Integer getMinRentDay();
    Double getPricePerDay();
}
class Seat2 implements Sellable {

    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Double price;
    public Seat2(String model, String color, Integer horsePower,String countryProduced, Double price){
        this.countryProduced=countryProduced;
        this.model=model;
        this.color=color;
        this.horsePower=horsePower;
        this.price=price;
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
    public Double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return String.format("%s is %s and have %d horse powers\nThis is %s produced in %s and have %d tires",
                this.getModel(), this.getColor(), this.getHorsePower(), this.getModel(), this.countryProduced, TIRES);
    }
}

class Audi implements Rentable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower,String countryProduced,
                Integer minRentDay, Double pricePerDay) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDay= minRentDay;
        this.pricePerDay=pricePerDay;
    }
    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }
    @Override
    public Double getPricePerDay() {
        return pricePerDay;
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
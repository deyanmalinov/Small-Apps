package com.DPM;
import java.util.Scanner;
public class ClassBox_DataValidation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());

        double width = Double.parseDouble(scan.nextLine());

        double height = Double.parseDouble(scan.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(String.format("Surface Area - %.2f", box.surfaceArea()));
            System.out.println(String.format("Lateral Surface Area - %.2f", box.lateralSurfaceArea()));
            System.out.println(String.format("Volume - %.2f", box.volume()));
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}

class Box {
    private double length;
    private double width;
    private double height;
    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    public void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }
    public void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }
    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
    public double surfaceArea(){
        return (2 * this.length * this.width) + this.lateralSurfaceArea();
    }
    public double lateralSurfaceArea(){
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }
    public double volume (){
        return this.length * this.width * this.height;
    }
}
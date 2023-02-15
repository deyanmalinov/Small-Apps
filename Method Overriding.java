package com.DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] line = scan.nextLine().split(" ");
            if (line.length > 1){
                double a = Double.parseDouble(line[0]);
                double b = Double.parseDouble(line[1]);
                Rectangle rectangle = new Rectangle(a,b);
                System.out.println(rectangle.area());
            }else {
                double a = Double.parseDouble(line[0]);
                Square square = new Square(a);
                System.out.println(a * a);
            }
        }
    }
}
public class Rectangle {
    protected double a;
    protected double b;
    protected Rectangle(double a){
        this.a = a;
    }
    protected Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    protected double area(){
        return this.a*this.b;
    }
}
public class Square extends Rectangle{
    private double a;
    public Square(double a) {
        super(a);
    }
    @Override
    protected double area() {
        return this.a * this.a;
    }
}
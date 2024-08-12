package com.DPM;
import java.util.Scanner;
public class ShapesDrawing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Drawables circle = new Circles(4);

        Drawables rectangle = new Rectangles(9,9);

        circle.draw();

        rectangle.draw();
    }
}
interface Drawables {
    void draw();
}
class Circles implements Drawables{
    private Integer radius;
    public Circles(Integer radius){
        this.radius = radius;
    }
    public Integer getRadius() {
        return radius;
    }
    @Override
    public void draw() {
        double r_in = this.getRadius() - 0.4;
        double r_out = this.getRadius() + 0.4;
        for (double y = this.getRadius(); y >= -this.getRadius(); --y) {
            for (double x = -this.getRadius(); x < r_out; x += 0.5) {
                double value = x * x + y * y;
                if (value >= r_in * r_in && value <= r_out * r_out) {
                    System.out.print("*");
                } else
                    System.out.print(" "); }
            System.out.println(); }
    }
}
class Rectangles implements Drawables{
    private Integer width;
    private Integer height;
    public Rectangles(Integer width, Integer height){
        this.width = width;
        this.height= height;
    }
    public Integer getWidth(){
        return width;
    }
    public Integer getHeight(){
        return height;
    }
    @Override
    public void draw() {
        for (int i = 0; i < this.getHeight(); i++) {
            System.out.print("*");
            for (int j = 1; j < this.getWidth() - 1; j++) {
                System.out.print(" ");
                if (i == 0 || i == (this.getHeight() - 1)){
                    System.out.print("*");
                } else { System.out.print(" "); }}
            System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
    }
}
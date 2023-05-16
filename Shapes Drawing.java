package DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drawable circle = new Circle(4);
        Drawable rectangle = new Rectangle(9,9);
        circle.draw();
        rectangle.draw();
    }
}-----------------------------
package DPM;
public interface Drawable {
    void draw();
}-----------------------------
package DPM;
public class Circle implements Drawable{
    private Integer radius;
    public Circle(Integer radius){
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
}---------------------------------------
package DPM;
public class Rectangle implements Drawable{
    private Integer width;
    private Integer height;
    public Rectangle(Integer width, Integer height){
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
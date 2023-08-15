package DPM;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        IntStream
                .rangeClosed(1, num)
                .boxed()
                .map(n -> scan.nextLine().split(" "))
                .map(data -> {
                    Car newCar;
                    if (data.length == 3){
                        newCar = new Car(data[0],data[1],Integer.parseInt(data[2]));
                    }else {
                        newCar = new Car(data[0]);
                    }
                    return newCar;
                })
                .forEach(car -> System.out.println(car.getCarInfo()));
    }
}
--------------------------------------------------------------------------
--------------------------------------------------------------------------
package DPM;
public class Car {
    private String make;
    public String getMake() {
        return make;
    }
    public Car(String make){
        this.make=make;
        this.model="unknown";
        this.horsePower= -1;
    }
    public Car (String make, String model, int horsePower){
        this(make);
        this.model=model;
        this.horsePower=horsePower;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    private String model;
    private int horsePower;
    public String getCarInfo(){
        return String.format("The car is: %s %s - %d HP.",
                this.getMake(), this.getModel(), this.getHorsePower());
    }
}
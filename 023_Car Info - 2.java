package com.DPM;
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
                .map(data ->{
            Car newCar = new Car();
            newCar.setMake(data[0]);
            newCar.setModel(data[1]);
            newCar.setHorsePower(Integer.parseInt(data[2]));
            return newCar;
        })
                .forEach(car -> System.out.println(car.getCarInfo()));
    }
}

package DPM;
public class Car {
        private String make;
        public String getMake() {
        return make;
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
package DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car newCar = new Car();
        int num = Integer.parseInt(scan.nextLine());
        String[] line = scan.nextLine().split("\\s+");

        for (int i = 0; i < num; i++) {
            newCar.setMake(line[0]);
            newCar.setModel(line[1]);
            newCar.setHorsePower(Integer.parseInt(line[2]));

            System.out.printf("The car is: %s %s - %d HP.%n",
                    newCar.getMake(), newCar.getModel(), newCar.getHorsePower());
            line = scan.nextLine().split("\\s+");
        }
    }
}
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
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
}
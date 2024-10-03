package com.DPM;
import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> parking = new HashSet<>();
        String line;
        while (!"END".equals(line=scan.nextLine())){
            String[] nums = line.split(", ");
            switch (nums[0]){
                case "IN":
                    parking.add(nums[1]);
                    break;
                case "OUT":
                    parking.remove(nums[1]);
            }
        }
        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String s : parking) {
                System.out.println(s);
            }
        }
    }
}
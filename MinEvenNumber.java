package com.DPM;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
public class MinEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Optional<Double> nums = Arrays.stream(scan.nextLine().split(" "))
                .filter(num -> !num.isEmpty())
                .map(Double::valueOf)
                .filter(num -> num % 2 == 0)
                .min(Double::compare);

        OptionalDouble nums2 = Arrays.stream(scan.nextLine().split(" "))
                .filter(num -> !num.isEmpty())
                .mapToDouble(Double::parseDouble)
                .filter(num -> num % 2 == 0)
                .min();

        if (nums2.isPresent()){
            System.out.printf("%.2f",nums.get()); //nums.getAsDouble();
        }else {
            System.out.println("No match");
        }
    }
}
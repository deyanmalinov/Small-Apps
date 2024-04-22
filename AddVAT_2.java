package com.DPM;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
public class AddVAT_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(", ");

        UnaryOperator<Double> addVat = d -> 1.2 * d;

        System.out.println("Prices with VAT:");

        Arrays.stream(line).map(Double::parseDouble)
                .map(addVat)
                .forEach(num -> System.out.printf("%.2f\n", num));
    }
}
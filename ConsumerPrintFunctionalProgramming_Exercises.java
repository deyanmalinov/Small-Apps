package com.DPM;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
public class ConsumerPrintFunctionalProgramming_Exercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split("\\s+");

        Consumer<String > print = System.out::println;

        Arrays.stream(line).forEach(print);
    }
}
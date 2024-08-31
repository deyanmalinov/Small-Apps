package com.DPM;
import java.util.*;
public class SumOfChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 0; i < lines; i++) {
            String chark = scan.nextLine();
            char znak = chark.charAt(0);
            int znakASCI = znak;
            sum += znakASCI;
        }
        System.out.println("The sum equals: " + sum);
    }
}
package com.DPM;


import java.util.Scanner;


public class SumDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}
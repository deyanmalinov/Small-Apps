package com.DPM;

import java.util.*;

public class FactorialDivision {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double numOne = Double.parseDouble(scan.nextLine());
            double secNum = Double.parseDouble(scan.nextLine());

            double devisRes = factor(numOne) / factor(secNum);
            System.out.printf("%.2f", devisRes);

    }
    public static double factor (double num){
            double fac = 1;
        for (int i = 2; i <= num; i++) {
            fac *= i;

        }
        return fac;
    }

}
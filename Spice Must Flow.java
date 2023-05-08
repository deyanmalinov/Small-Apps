package com.DPM;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int spice = scan.nextInt();
        int days=0;
        int tatalSpice = 0;
        while (spice>=100){
            days++;
            tatalSpice += (spice-26);
            spice -=10;
        }
        if (tatalSpice>=26){
            tatalSpice -=26;
        }
        System.out.println(days);
        System.out.println(tatalSpice);

    }
}
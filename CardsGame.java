package com.DPM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        List<Integer> fpD = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            fpD.add(i, Integer.parseInt(line[i]));
        }
        String [] line2 = scan.nextLine().split(" ");
        List<Integer> spD = new ArrayList<>();
        for (int i = 0; i < line2.length; i++) {
            spD.add(i, Integer.parseInt(line2[i]));
        }
        while (!fpD.isEmpty() && !spD.isEmpty()){
            int fcard = fpD.get(0);
            int scard = spD.get(0);
            if (fcard>scard){
                fpD.add(fcard);
                fpD.add(scard);
                fpD.remove(0);
                spD.remove(0);
            }
            if (scard>fcard){
                spD.add(scard);
                spD.add(fcard);
                fpD.remove(0);
                spD.remove(0);
            }
            if (scard == fcard){
                fpD.remove(0);
                spD.remove(0);
            }



        }
        int sum =0;
        if (fpD.size()>spD.size()){
            for (Integer integer : fpD) {
                sum +=integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
        if (fpD.size()<spD.size()){
            for (Integer integer : spD) {
                sum +=integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}

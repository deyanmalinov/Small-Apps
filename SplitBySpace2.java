package com.DPM;
import java.util.*;
public class SplitBySpace2 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String nums = scan.nextLine();

            String [] mas = nums.split(" ");

            int [] chisla = new int [mas.length];

            int sum =0;

            for (int i = 0; i < chisla.length; i++) {
                chisla[i] = Integer.parseInt(mas[i]);
                if (chisla[i] %2 == 0){
                    sum += chisla[i];
                }
            }
            System.out.println(sum);
        }
}
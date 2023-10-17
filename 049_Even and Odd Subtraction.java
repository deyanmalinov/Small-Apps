package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            String [] arr = line.split(" ");
            int [] newArr = new int[arr.length];
            int oddSum = 0;
            int evenSum = 0;

            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = Integer.parseInt(arr[i]);
                if (newArr[i] % 2 == 0){
                    evenSum += newArr[i];
                }else {
                    oddSum += newArr[i];
                }

            }
            System.out.println(evenSum-oddSum);
            

        }

}
package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String one = scan.nextLine();
            String two = scan.nextLine();

            String [] oArr = one.split(" ");
            String [] tArr = two.split(" ");

            int [] oiArr = new int[oArr.length];
            int [] tiArr = new int[tArr.length];
            int sum =0;

            for (int i = 0; i < oiArr.length; i++) {
                oiArr[i] = Integer.parseInt(oArr[i]);
            }
            for (int i = 0; i < tiArr.length; i++) {
                tiArr[i] = Integer.parseInt(tArr[i]);

            }
            if (Arrays.equals(tiArr, oiArr)){

                for (int i = 0; i < tiArr.length; i++) {
                    sum += tiArr[i];

                }

                System.out.println("Arrays are identical. Sum: " + sum);
            }else {
                for (int i = 0; i < oiArr.length; i++) {
                    if (tiArr[i] != oiArr[i]) {
                        System.out.println("Arrays are not identical. Found difference at "+ i +" index.");
                        break;
                    }
                    
                }

            }

        }

}
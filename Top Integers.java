package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String [] line = scan.nextLine().split(" ");
            int [] nums = new int[line.length];

            boolean isBig = false;
            for (int i = 0; i < line.length; i++) {
                nums[i]=Integer.parseInt(line[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] < nums[j]){
                        isBig = false;
                        break;
                    }else {
                        isBig = true;
                    }

                }
                if (isBig == true){
                    System.out.print(nums[i]+" ");
                }
            }


        }

}
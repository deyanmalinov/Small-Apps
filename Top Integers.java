package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String [] line = scan.nextLine().split(" ");
            int [] nums = new int[line.length];

            boolean isTop = false;
            for (int i = 0; i < line.length; i++) {
                nums[i]=Integer.parseInt(line[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] < nums[j]){
                        isTop = false;
                        break;
                    }else {
                        isTop = true;
                    }

                }
                if (isTop == true){
                    System.out.print(nums[i]+" ");
                }
            }


        }

}
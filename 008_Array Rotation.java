package com.DPM;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] nums = scan.nextLine().split(" ");
        int rot = Integer.parseInt(scan.nextLine());
        rot= rot % nums.length;
        for (int i = 0; i < rot; i++) {
            String ele = nums[0];
            for (int j = 0; j < nums.length-1; j++) {
                nums[j] = nums[j+1];
            }
            nums[nums.length-1] = ele;
        }
        for (String num : nums){
            System.out.print(num+" ");
        }
    }
}
package com.DPM;
import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            nums.push(Integer.parseInt(line[i]));
        }
        for (Integer num : nums) {
            System.out.print(nums.pop()+" ");
        }
    }
}
package com.DPM;
public class arraysPrint {
    public static void main(String[] args) {

        int[] array = arrayOfMultiples(2, 3);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static int[] arrayOfMultiples(int num, int length) {

            int[] nums = new int[length];

            int sum = 0;
            for (int i=0; i <length; i++) {
                sum = sum + num;
                nums[i] = sum;
            }
            return nums;
    }
}
package com.DPM;
public class warOfNumbers {
    public static void main(String... args) {

        int result = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int[] array = {2, 8, 6, 3, 9, 1};
        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

        result = Math.abs(sumEven - sumOdd);

        System.out.println(result);
    }
}

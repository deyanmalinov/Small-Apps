package com.DPM;

public class SumArrays {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6};
        if(numbers.length>0){
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
        }else {
            sum = numbers[0];
        }
//        System.out.println(sum);
        sum=recurs(numbers, numbers.length);
        System.out.println(sum);
    }
    public static int recurs(int[] array, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return array[n - 1] + recurs(array, n - 1);
        }
    }
}

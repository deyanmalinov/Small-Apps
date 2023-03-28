package com.DPM;
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[3];
        fillArray(arr, 0);
    }
     private static void fillArray(int[] arr, int index) {
         if (index >= arr.length) {
             printArr(arr);
             return;
         }
             for (int i = 0; i <= 1; i++) {
                 arr[index] = i;
                 fillArray(arr, index + 1);
             }
         }
     private static void printArr(int[] arr) {
         for (int i : arr) {
             System.out.print(i);
         }
        System.out.println();
    }
}
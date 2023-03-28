package com.DPM;

public class Main {

    public static void main(String[] args) {
        int arrSize = 3;
        int num = 5;
        int[] arr = new int[arrSize];

        while (true){
            Print(arr);
            int index = arrSize-1;
            while (index >= 0 && arr[index] == 4){
                index--;
            }
            if (index < 0){
                break;
            }
            arr[index]++;
            for (int i = index+1; i < arrSize ; i++) {
                arr[i]=0;
            }
        }
    }
    private static void Print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
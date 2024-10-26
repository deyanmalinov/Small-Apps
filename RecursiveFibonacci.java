package com.DPM;
import java.util.Scanner;

public class RecursiveFibonacci {
    private static long[] memory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        memory = new long[number+1];
        long res = getFib(number);
        System.out.println(res);
    }

    private static long getFib(int number) {
        if (number < 2){
            return 1;
        }
        if (memory[number] !=0){
            return memory[number];
        }
        return memory[number] = getFib(number-1) + getFib(number-2);
    }
}
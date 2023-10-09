package com.DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int matSize = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[matSize][matSize];
        int sum = 0; int sum2 = 0;
        for (int row = 0; row < matSize; row++) {
            String[] line = scan.nextLine().split(" ");
            for (int col = 0; col < matSize; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        for (int col = 0; col < matSize; col++) {
                sum = matrix[col][col] + sum;
            }
        for (int col = 0; col < matSize; col++) {
            sum2 = matrix[col][matSize-1-col] + sum2;
        }
        if (sum>sum2){
            System.out.println(sum-sum2);
        }else {
            System.out.println(sum2-sum);
        }
    }
}
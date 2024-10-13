package com.DPM;
import java.util.Arrays;
import java.util.Scanner;
public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            int[] line = Arrays.stream(scan.nextLine().split(" ")).
                    mapToInt(Integer::parseInt).toArray();
            matrix[i] = line;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[size-1-i][i]+" ");
        }
        System.out.println();
    }
}
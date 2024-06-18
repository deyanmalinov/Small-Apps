package com.DPM;

import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(", ");

        int  size = Integer.parseInt(line[0]);

        String type = line[1];

        int[][] matrix = new int[size][size];

        int fill= 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < size; j++) {
                    matrix[j][i] = fill++;
                }
            }else {
                for (int j = matrix.length-1; j >= 0; j--) {
                    matrix[j][i] = fill++;
                }
            }
        }
    }
}
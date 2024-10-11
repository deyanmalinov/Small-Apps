package com.DPM;
import java.util.Scanner;
public class PositionsOf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] matSize = scan.nextLine().split(" ");
        int rows = Integer.parseInt(matSize[0]);
        int cols = Integer.parseInt(matSize[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] line = scan.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        int num = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == num){
                    System.out.println(i + " "+ j);
                    flag = true;
                }

            }

        }if (!flag){
            System.out.print("not found");
        }

    }
}
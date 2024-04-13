package com.DPM;
import java.util.Scanner;
public class MatrixOfPalindromes {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        int rows = Integer.parseInt(line[0]);

        int cols = Integer.parseInt(line[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                String ele ="" + (char)('a'+ row) + (char)('a'+ row + col) + (char)('a'+ row);
                matrix[row][col] = ele;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
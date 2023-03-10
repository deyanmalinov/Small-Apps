package com.DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String[] line = scan.nextLine().split(" ");
//        int rows = Integer.parseInt(line[0]);
//        int cols = Integer.parseInt(line[1]);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();
        String[][] matrix = new String[rows][cols];
        for (int r = 0; r < rows; r++) {
            matrix[r] = scan.nextLine().split(" ");
        }
        String comand = scan.nextLine();
        while (!comand.equals("END")){
            String[] tokens = comand.split(" ");
            if (tokens[0].equals("swap") && tokens.length == 5){
                int firRow = Integer.parseInt(tokens[1]);
                int firCol = Integer.parseInt(tokens[2]);
                int secRow = Integer.parseInt(tokens[3]);
                int secCol = Integer.parseInt(tokens[4]);
                if (isInBound(matrix, firRow, firCol) && isInBound(matrix, secRow, secCol)){
                    String temp = matrix[firRow][firCol];
                    matrix[firRow][firCol] = matrix[secRow][secCol];
                    matrix[secRow][secCol] = temp;
                   PrintMatrix(matrix);
                }else {
                    System.out.println("Invalid input!");
                }
            }else {
                System.out.println("Invalid input!");
            }
            comand = scan.nextLine();
        }
    }
    private static boolean isInBound(String[][] matrix, int row, int col) {
        return row >= 0 && matrix.length > row && col >= 0 && col < matrix[row].length;
    }
    private static void PrintMatrix(String matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
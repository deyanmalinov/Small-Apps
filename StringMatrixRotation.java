package com.DPM;
import java.util.ArrayList;
import java.util.Scanner;
public class StringMatrixRotation {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] rotate = scan.nextLine().split("[ () ]+");

        int angle = Integer.parseInt(rotate[1]) % 360;

        ArrayList<String> array = new ArrayList<>();

        String line = scan.nextLine();

        int maxLen = line.length();

        while (!line.equals("END")){
            array.add(line);
            line = scan.nextLine();
            if (maxLen < line.length()){
                maxLen = line.length();
            }
        }
        char[][] matrix = new char[array.size()][maxLen];
        for (int row = 0; row < array.size(); row++) {
            for (int col = 0; col < maxLen; col++) {
                if (col > array.get(row).length() - 1){
                    matrix[row][col] = ' ';
                }else {
                    matrix[row][col] = array.get(row).charAt(col);
                }
            }
        }
        if (angle == 90){
            for (int col = 0; col < maxLen; col++) {
                for (int row = matrix.length -1; row >=0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }else if (angle == 180){
            for (int row = matrix.length-1; row >=0; row--) {
                for (int col = maxLen -1; col >=0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }else if (angle == 270){
            for (int row = maxLen-1; row >=0; row--) {
                for (int col = 0; col <matrix.length ; col++) {
                    System.out.print(matrix[col][row]);
                }
                System.out.println();
            }
        }else {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < maxLen ; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }
}
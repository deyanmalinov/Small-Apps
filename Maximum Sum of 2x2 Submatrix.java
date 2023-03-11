import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] matrSize = scan.nextLine().split(", ");
        int rows = Integer.parseInt(matrSize[0]);
        int cols = Integer.parseInt(matrSize[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            String[] line= scan.nextLine().split(", ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col]= Integer.parseInt(line[col]);
            }
        }
        int maxSum = 0; 
        int rowMax = 0; 
        int colMax = 0;
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                int colSum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
                if (colSum > maxSum){
                    maxSum = colSum;
                    rowMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println(matrix[rowMax][colMax]+ " " + matrix[rowMax][colMax+1]);
        System.out.println(matrix[rowMax+1][colMax]+ " " + matrix[rowMax+1][colMax+1]);
        System.out.println(maxSum);
    }
}
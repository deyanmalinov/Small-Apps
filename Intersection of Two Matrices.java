package DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] fMatrix = new char[rows][cols];
        char[][] sMatrix = new char[rows][cols];

        for (int row = 0; row < fMatrix.length; row++) {
            String [] line = scan.nextLine().split(" ");
            for (int col = 0; col < fMatrix[0].length; col++) {
                fMatrix[row][col] = line[col].charAt(0);
            }
        }
        for (int row = 0; row < sMatrix.length; row++) {
            String [] line = scan.nextLine().split(" ");
            for (int col = 0; col < sMatrix[0].length; col++) {
                sMatrix[row][col] = line[col].charAt(0);
            }
        }
        for (int row = 0; row < fMatrix.length; row++) {
            System.out.println();
            for (int col = 0; col < fMatrix[0].length; col++) {
                if (fMatrix[row][col] != sMatrix[row][col]){
                    System.out.print("* ");
                }else {
                    System.out.print(fMatrix[row][col]+ " ");
                }

            }

        }
    }
}
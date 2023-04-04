package DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] fLine = scan.nextLine().split(", ");
        int row = Integer.parseInt(fLine[0]);
        int col = Integer.parseInt(fLine[1]);
        int fullSum = 0;
        int sum =0;
        for (int i = 0; i < row; i++) {
            fullSum +=sum;
            String [] numLine = scan.nextLine().split(", ");
            for (int j = 0; j < numLine.length; j++) {
                int num = Integer.parseInt(numLine[j]);
                sum += num;

            }

        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);

    }
}
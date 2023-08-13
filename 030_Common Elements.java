package DPM;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] fmas = scan.nextLine().split(" ");
        String[] smas = scan.nextLine().split(" ");
        for (int i = 0; i < smas.length; i++) {
            for (int j = 0; j < fmas.length; j++) {
                if (smas[i].equals(fmas[j])){
                    System.out.print(smas[i]+" ");
                    break;
                }

            }

        }
    }
}
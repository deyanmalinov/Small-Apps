package DPM;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger fnum = scan.nextBigInteger();
        BigInteger snum = scan.nextBigInteger();

        System.out.println(fnum.add(snum));
    }
}
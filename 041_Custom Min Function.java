package DPM;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> min = arr ->{
            int minnum = Arrays.stream(arr).min().getAsInt();
            return minnum;
        };
        System.out.println(min.apply(nums));
    }
}
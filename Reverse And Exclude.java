import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int dev = Integer.parseInt(scan.nextLine());
        nums.stream()
                .filter(num -> num % dev != 0)
                .sorted((x,y)-> -1)
                .forEach(num -> System.out.print(num + " "));

    }
}
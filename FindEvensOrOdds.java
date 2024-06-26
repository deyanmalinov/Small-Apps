package com.DPM;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        String evenOrOdd = scan.nextLine();
        Predicate<Integer> even = x -> x % 2 == 0;
        Predicate<Integer> odd = x -> x % 2 != 0;
        int start = Integer.parseInt(line[0]);
        int end = Integer.parseInt(line[1]);
        Predicate<Integer> type = even;
        if (evenOrOdd.equals("odd")){
            type = odd;
        }
        IntStream.rangeClosed(start, end)
                .boxed()
                .filter(type)
                .forEach(x -> System.out.printf("%d ", x));
    }
}
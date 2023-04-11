package com.DPM;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(x->Integer.parseInt(x))
                .collect(Collectors.toList());
        nums.stream().
                filter(num -> 10 <= num && num <= 20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.print(x + " "));

Arrays.stream(scan.nextLine()
                .split(" "))
                .map(x->Integer.parseInt(x))
                .collect(Collectors.toList()).stream().
                filter(num -> 10 <= num && num <= 20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.print(x + " "));

    }
}
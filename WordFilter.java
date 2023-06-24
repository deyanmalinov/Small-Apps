package com.DPM;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        Arrays.asList(line).stream().filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
/////////////////////////////////////
        Arrays.stream(scan.nextLine().split(" ")).
                filter(w -> w.length() % 2 == 0).
                forEach(e -> System.out.println(e));
    }
}

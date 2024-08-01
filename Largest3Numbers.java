package com.DPM;

import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(Arrays.stream(scan.nextLine().split(" "))
                    .map(n -> Integer.parseInt(n))
                    .sorted(Collections.reverseOrder())
                    .limit(3)
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining(" ")));
        }
}
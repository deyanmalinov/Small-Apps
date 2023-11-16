package com.DPM;


import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = Arrays.asList(scan.nextLine().split(" "));
        HashSet<Character> letters = new HashSet<>();

        Stream.of(scan.nextLine()
                .split(" "))
                .map(ch -> ch.toLowerCase().charAt(0))
                .forEach(ch -> letters.add(ch));
        Optional<String> name = names.stream()
                .filter(str -> letters.contains(str.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();
        if (name.isPresent()){
            System.out.println(name.get());
        }else {
            System.out.println("No match");
        }
    }
}
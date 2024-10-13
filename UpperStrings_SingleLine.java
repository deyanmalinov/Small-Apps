package com.DPM;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class UpperStrings_SingleLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> names = Arrays.stream(scan.nextLine()
                .split(" "))
                .collect(Collectors.toList());

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

Arrays.stream(scan.nextLine()
                .split(" "))
                .collect(Collectors.toList()).stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
    }
}
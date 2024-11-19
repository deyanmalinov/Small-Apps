package com.DPM;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> guest = new TreeSet<>();
        String line;
        while (!"PARTY".equals(line = scan.nextLine())){
            guest.add(line);
        }
        while (!"END".equals(line = scan.nextLine())){
            guest.remove(line);
        }
        System.out.println(guest.size());
        for (String s : guest) {
            System.out.println(s);
        }
    }
}
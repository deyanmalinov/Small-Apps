package com.DPM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            String ele = line[i];
            int lenght = ele.length();
            for (int j = 0; j < lenght; j++) {
                System.out.print(ele);
            }
        }
    }
}
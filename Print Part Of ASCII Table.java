package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int begin = Integer.parseInt(scan.nextLine());
            int end = Integer.parseInt(scan.nextLine());

            for (int i = begin; i <=end ; i++) {
                char znak = (char)i;
                System.out.print(znak+ " ");
            }
        }

}
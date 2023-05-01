package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n ; k++) {
                        char fchar = (char)('a' +i);
                        char schar = (char)('a' +j);
                        char tchar = (char)('a' +k);
                        System.out.printf("%c%c%c%n", fchar, schar,tchar);
                    }

                    

                }

            }
        }

}
package com.DPM;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String line = "";
            while (!"end".equals(line=scan.nextLine()){
                String newLine = "";

                for (int i = line.length()-1; i >=0 ; i--) {
                    newLine += line.charAt(i);
                }

                System.out.printf("%s = %s\n",line, newLine);

            }

        }
}
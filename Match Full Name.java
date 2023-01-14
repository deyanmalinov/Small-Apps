package com.DPM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
            String string = scan.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                System.out.print(matcher.group(0)+" ");

            }

        }
}
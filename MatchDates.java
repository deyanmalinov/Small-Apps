package com.DPM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
            String regex = "\\b(?<buk>\\d{2})([-.\\/])(?<cif>[A-Z][a-z]{2})\\2(?<nish>[\\d]{4})\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher line = pattern.matcher(string);


            while (line.find()) {
                String buk = line.group("buk");
                String cif = line.group("cif");
                String nish = line.group("nish");
               System.out.printf("Day: %s, Month: %s, Year: %s\n", buk, cif, nish);
            }


        }
}
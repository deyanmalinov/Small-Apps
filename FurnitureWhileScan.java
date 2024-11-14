package com.DPM;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FurnitureWhileScan {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String regex = "\\>\\>(?<one>[A-Za-z]+)\\<\\<(?<two>[\\d\\.]+)!(?<three>[\\d]+)";

            List<String> mebel = new ArrayList<>();

            String string = scan.nextLine();

            double sum =0;

            while (!"Purchase".equals(string)){
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                mebel.add(matcher.group("one"));
                double cena = Double.parseDouble(matcher.group("two"));
                int broi = Integer.parseInt(matcher.group("three"));
                sum += cena*broi;
            }
                string = scan.nextLine();
           }

            System.out.println("Bought furniture:");

            for (String s : mebel) {
                System.out.println(s);
            }
            System.out.printf("Total money spend: %.2f", sum);
        }
}
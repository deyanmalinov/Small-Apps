package com.DPM;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchPhoneNumber {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

            String string = scan.nextLine();

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(string);

            List<String> phones = new LinkedList<>();

            while (matcher.find()) {
                phones.add(matcher.group());
            }
            System.out.println(String.join(", ",phones));
        }
}
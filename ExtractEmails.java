package com.DPM;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractEmails {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String regex = "\\s[A-Za-z][\\w.-]*@[A-Za-z-]+(\\.[A-Za-z]+)+";

            String string = scan.nextLine();

            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

            Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                System.out.println(matcher.group(0));
            }
        }
}
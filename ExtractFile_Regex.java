package com.DPM;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractFile_Regex {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String line = scan.nextLine();

            List<String> file = Arrays.asList(line.substring(line
                            .lastIndexOf("\\") + 1)
                            .split("\\."));

            String nFile = String.join(".", file.subList(0, file.size()-1));

            String ext = file.get(file.size()-1);

            System.out.println("File name: " + nFile);

            System.out.println("File extension: " + ext);

            String regex = "(.*)\\.(.*)";

            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

            Matcher matcher = pattern.matcher((CharSequence) file);

            if (matcher.find()) {
                System.out.println("File name: " + matcher.group(1));
                System.out.println("File extension: " + matcher.group(2));
            }
        }
}
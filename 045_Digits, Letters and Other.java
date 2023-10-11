package com.DPM;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
            String regex = "(?<buk>[a-zA-Z]+)?(?<nish>[\\W]+)?(?<cif>[\\d]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher line = pattern.matcher(string);
            List<String> buk = new LinkedList<>();
            List<String> cif = new LinkedList<>();
            List<String> nish = new LinkedList<>();

            while (line.find()) {
                buk.add(line.group("buk"));
                cif.add(line.group("cif"));
               nish.add(line.group("nish"));

            }
            System.out.println(cif.toString().replaceAll(", ", "")
                    .replaceAll("\\[|\\]", ""));
            System.out.println(buk.toString().replaceAll(", ", "")
                    .replaceAll("\\[|\\]", ""));
            System.out.println(nish.toString().replaceAll(", ", "")
                    .replaceAll("\\[|\\]", "").replaceAll("null", ""));

        }
}
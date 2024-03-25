package com.DPM;

import java.util.Scanner;

public class TextFilter {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String [] banWords = scan.nextLine().split(", ");
            String line = scan.nextLine();

            for (String word : banWords) {
                if (line.contains(word)){
                    String newStr = replace("*", word.length());
                    line = line.replace(word, newStr);
                }
            }
            System.out.println(line);
        }
        public static String replace (String text, int count){
            String res = "";
            for (int i = 0; i < count; i++) {
                res += text;
            }return res;
        }
//        for (String word : banWords) {
//            String stars = word.replaceAll(".", "*");
//            line = line.replace(word, stars);
//        }
//        System.out.println(line);
}
package com.DPM;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
public class CountUppercaseWords_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] textAsList = scan.nextLine().split("\\s+");

        Predicate<String> checkerUpperCase =
                word -> Character.isUpperCase(word.charAt(0));

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < textAsList.length; i++) {
            if (checkerUpperCase.test(textAsList[i]))
                result.add(textAsList[i]);
        }
        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
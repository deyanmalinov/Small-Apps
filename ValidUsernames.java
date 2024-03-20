package com.DPM;

import java.util.*;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(", ");


        for (int i = 0; i < line.length; i++) {
            if (valid(line[i])){
                System.out.println(line[i]);
            }
        }
    }
    public static boolean valid (String word){
        if (word.length()<3 || word.length()>16){
        return false;
        }
        for (int j = 0; j < word.length(); j++) {
            char bukva = word.charAt(j);
            if (!(Character.isLetterOrDigit(bukva)
            || bukva == '-' || bukva =='_')) {
                return false;
            }
        }
        return true;
    }
}
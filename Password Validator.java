package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String pass = scan.nextLine();
            if (validPass(pass)){
                System.out.println("Password is valid");
            }
        }
        public static boolean validPass (String s){
            boolean correctCharCount = validCount(s);
            boolean onlyLandD = coutValid(s);
            boolean haveThoDig = twoDigVal(s);
            return correctCharCount && onlyLandD && haveThoDig;

        }

    private static boolean twoDigVal(String s) {
            int digCout = 0;
        for (int i = 0; i < s.length(); i++) {
            char sim = s.charAt(i);
            if (Character.isDigit(sim)){
                digCout ++;
                if (digCout >=2){
                    return true;
                }
            }

        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean coutValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char simb = s.charAt(i);
            if (!Character.isLetterOrDigit(simb)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }

        }
        return true;
    }

    private static boolean validCount(String s) {
            boolean isValid = s.length() > 5 && s.length() < 11;
            if (!isValid){
                System.out.println("Password must be between 6 and 10 characters");
                return false;
            }
         return true;
    }
}
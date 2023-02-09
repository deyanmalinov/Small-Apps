package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            System.out.println(printMidle(line));

    }
    public static String printMidle (String s){
            String res = "";
            int midInd = s.length()/2;
            if (s.length()%2 == 0){
                res += s.charAt(midInd-1);
                res += s.charAt(midInd);
            }else {
                res += s.charAt(midInd);
            }
            return res;
    }
}
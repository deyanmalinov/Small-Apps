package com.DPM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String res ="";
        char ch = text.charAt(0);
        res += ch;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (ch != symbol){
                ch=symbol;
                res +=ch;
            }
        }
        System.out.println(res);
    }
}
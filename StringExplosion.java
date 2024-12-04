package com.DPM;

import java.util.*;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String text = scan.nextLine();
       String res = "";
        for (int i = 0; i < text.length(); i++) {
            char bomb = text.charAt(i);
            if (bomb =='>'){
                res+=bomb;
                i++;
                int explosion = text.charAt(i) - '0';
                explosion--;
                while (explosion > 0 && i < text.length()-1){
                    i++;
                    bomb = text.charAt(i);
                    if (bomb == '>'){
                        res+=bomb;
                        i++;
                        explosion += text.charAt(i) - '0';
                        explosion--;
                        continue;
                    }
                   explosion--;
                }
            }else {
                res+= bomb;
            }
        }
        System.out.println(res);
    }
}
package com.DPM;
import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = "";
            while (true){

                line = scan.nextLine();
                if (line.equals("END")){
                    break;
                }
                for (int i = 0; i <= line.length()/2; i++) {
                    int lenth = line.length();

                    if (line.charAt(i) == line.charAt(lenth-1)){
                        lenth--;
                        System.out.println(true);
                        break;
                    }else {
                        System.out.println(false);
                        break;
                    }
                }

            }
    }
}
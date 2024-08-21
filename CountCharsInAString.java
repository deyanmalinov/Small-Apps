package com.DPM;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Map<Character, Integer> lMap = new LinkedHashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch != ' '){
                if (lMap.containsKey(ch)){
                    lMap.put(ch, lMap.get(ch)+1);
                }else {
                    lMap.put(ch, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : lMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
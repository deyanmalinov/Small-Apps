package com.DPM;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        Map <String, List<String>> newMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            newMap.putIfAbsent(str1, new ArrayList<>());
            newMap.get(str1).add(str2);
        }

        for (Map.Entry<String, List<String>> entry : newMap.entrySet()) {
            String value1 = String.join(", ", entry.getValue());
            System.out.printf("%s - %s\n", entry.getKey(), value1);
        }
    }
}

package com.DPM;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> resurs = new LinkedHashMap<>();

        String line = scan.nextLine();

        while (!line.equals("stop")){
            String fline = line;
            String sLine = scan.nextLine();
            if (!resurs.containsKey(fline)){
                resurs.put(fline, Integer.parseInt(sLine));
            }else {
                resurs.put(fline, resurs.get(fline)+ Integer.parseInt(sLine));
            }
            line=scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resurs.entrySet()) {
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }
    }
}
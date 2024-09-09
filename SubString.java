package com.DPM;
import java.util.*;
public class SubString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sub = scan.nextLine();

        String line = scan.nextLine();

        while (line.contains(sub)){
             line= line.replace(sub, "");
        }
        System.out.println(line);
    }
}
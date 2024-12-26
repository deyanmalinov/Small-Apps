package com.DPM;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Integer> goods = new LinkedHashMap<>();

        String line = "";

        while (!"stop".equals(line = scan.nextLine())){

            String metal = line;

            int amaunt = Integer.parseInt(scan.nextLine());
            if (goods.containsKey(line)){
                goods.put(metal, goods.get(metal)+amaunt);
            }else {
                goods.put(metal, amaunt);
            }
        }
        goods.forEach((key, value ) -> System.out.printf("%s -> %d\n", key, value));
    }
}
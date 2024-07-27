package com.DPM;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> keyMaterial = new LinkedHashMap<>();

        keyMaterial.put("shards", 0);
        keyMaterial.put("fragments", 0);
        keyMaterial.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        String winer = "";

        boolean flag = false;
        do {
            String[] data = scan.nextLine().split(" ");
            for (int i = 0; i < data.length; i += 2) {
                int quant = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();
                if (!keyMaterial.containsKey(material)) {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quant);
                    } else {
                        junk.put(material, junk.get(material) + quant);
                    }
                } else {
                    keyMaterial.put(material, keyMaterial.get(material) + quant);
                    if (keyMaterial.get(material) >= 250) {
                        keyMaterial.put(material, keyMaterial.get(material) - 250);
                        winer = material;
                        flag = true;
                        break;
                    }
                }
            }
        } while (!flag);

        if (winer.equals("shards")){
            System.out.println("Shadowmourne obtained!");
        }else if (winer.equals("motes")){
            System.out.println("Dragonwrath obtained!");
        }else if (winer.equals("fragments")){
            System.out.println("Valanyr obtained!");
        }
        keyMaterial.entrySet().stream().sorted((e1,e2) ->{
            int sort = Integer.compare(e2.getValue(), e1.getValue());
            if (sort == 0){
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.println(String.format(
                    "%s: %d", e.getKey(), e.getValue()
            ));
        });
        junk.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
                });
    }
}
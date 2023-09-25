package com.DPM;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [] nums = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> newMap = new TreeMap<>();

        for (double num : nums) {
            if (!newMap.containsKey(num)){
                newMap.put(num, 0);
            }
            newMap.put(num, newMap.get(num)+1);
        }
        for (Map.Entry<Double, Integer> entry : newMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        List<String> fpD = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            fpD.add(i, line[i]);
        }
//        Collections.shuffle(fpD);
//        System.out.println(String.join(System.lineSeparator(), fpD));

        Random rnd = new Random();
        while (!fpD.isEmpty()){
            int num = rnd.nextInt(fpD.size());
            System.out.println(fpD.get(num));
            fpD.remove(num);
        }
    }
}
package com.DPM;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] comands = scan.nextLine().split("\\s+");
        String[] line = scan.nextLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            queue.offer(Integer.parseInt(line[i]));
        }
        int times= Integer.parseInt(comands[1]);
        for (int i = 0; i <times ; i++) {
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println(0);
        }else {
            int element = Integer.parseInt(comands[2]);
            if (queue.contains(element)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
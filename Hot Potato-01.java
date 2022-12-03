package com.DPM;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");
        int num = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            queue.offer(line[i]);
        }
        while (queue.size() > 1){
                for (int i = 0; i < num-1; i++) {
                    String name = queue.poll();
                    queue.offer(name);
                }
            System.out.println("Removed "+queue.poll());
        }
            for (String s : queue) {
            System.out.println("Last is " + s);
        }
    }
}
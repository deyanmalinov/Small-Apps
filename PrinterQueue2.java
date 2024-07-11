package com.DPM;
import java.util.ArrayDeque;
import java.util.Scanner;
public class PrinterQueue2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String comand = scan.nextLine();

        while (!"Print".equals(comand)){
            if ("Cancel".equals(comand)){
                if (queue.isEmpty()){
                    System.out.println("Printer is on Standby");
                }else {
                    System.out.println("Canceled "+ queue.poll());
                }
            }else {
                queue.offer(comand);
            }
            comand = scan.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
package com.DPM;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String line ;

        while (!"print".equalsIgnoreCase(line= scan.nextLine())){

            if (!line.equals("cancel")){
                queue.offer(line);


            }else {
                if (queue.size() !=0){
                    System.out.println("Canceled " + queue.poll());
                }else {
                    System.out.println("Printer is on standby");
                }
            }
        }
        while (queue.size() != 0){
            System.out.println(queue.poll());
        }
    }
}
package com.DPM;
import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String line = scanner.nextLine();
       int number = Integer.parseInt(line);
        int balance = 0;

        System.out.println("Enter amounts (type 'end' to finish input):");

        while (scanner.hasNext()) {
            if (scanner.hasNext())
            if (scanner.hasNextInt()) {
                int amount = scanner.nextInt();
                balance += amount;
                System.out.println( amount > 0 ? "increase " + amount : "decrese " + amount);
            } else if (scanner.next().equals("end")) {
                break;
            }
        }

        System.out.println("balance " + balance);
        scanner.close();
    }
}
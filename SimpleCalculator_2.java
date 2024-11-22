package com.DPM;
import java.util.ArrayDeque;
import java.util.Scanner;
public class SimpleCalculator_2 {
    public static void main(String[] args) {

        //2 + 5 + 10 - 2 - 1

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        //Collections.addAll(stack, line);

        for (int i = line.length-1; i > -1; i--) {
            stack.push(line[i]);
        }
        while (stack.size()>1){
           int a = Integer.parseInt(stack.pop());
           String znak = stack.pop();
           int b = Integer.parseInt(stack.pop());
           if (znak.equals("+")){
               stack.push(""+(a+b));
           }else {
               stack.push(""+(a-b));
           }
         }
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
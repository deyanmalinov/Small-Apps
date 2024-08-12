package com.DPM;
import java.util.*;
public class SimpleCalculator1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, line);

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String sign = stack.pop();
            int second = Integer.parseInt(stack.pop());
            switch (sign){
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first-second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
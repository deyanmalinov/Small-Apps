package com.DPM;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num == 0){
            System.out.println(0);
            return;
        }
        Deque<Integer> stack = new ArrayDeque<>();

        while (num !=0){
            stack.push(num % 2);
            num /= 2;
        }
        for (Integer integer : stack) {
            System.out.print(stack.pop());
        }
    }
}
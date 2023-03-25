package com.DPM;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int comandCount = Integer.parseInt(scan.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < comandCount; i++) {
            String[] comands = scan.nextLine().split(" ");
            int com = Integer.parseInt(comands[0]);
            switch (com){
                case 1:
                    int number = Integer.parseInt(comands[1]);
                    if (number >= maxValue){
                        maxValue = number;
                        maxStack.push(maxValue);
                    }
                    stack.push(number);
                    break;
                case 2:
                    int delNums = stack.pop();
                    if (delNums == maxValue){
                        maxStack.pop();
                        if (!maxStack.isEmpty()){
                            maxValue = maxStack.peek();
                        }else {
                            maxValue = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
            }
        }

    }
}
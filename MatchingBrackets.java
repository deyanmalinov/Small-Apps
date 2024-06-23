package com.DPM;
import java.util.*;
public class MatchingBrackets {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == '(') {
                stack.push(i);
            }
            else if (ch == ')') {
                int startIndex = stack.pop();
                String contents = line.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
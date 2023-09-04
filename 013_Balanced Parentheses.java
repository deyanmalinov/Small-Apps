package com.DPM;

        import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] breces = scan.nextLine().toCharArray();
        if (breces.length % 2 != 0){
            System.out.println("NO");
            return;
        }
        Deque<Character> openBr = new ArrayDeque<>();
        boolean isBal = true;
        for (char brece : breces) {
            if (brece == '{' || brece == '[' || brece == '('){
                openBr.push(brece);
            }else {
                char currentBra = openBr.pop();
                if (brece == '}'){
                    brece = '{';
                }
                if (brece == ']'){
                    brece = '[';
                }
                if (brece == ')'){
                    brece = '(';
                }
                if (brece != currentBra){
                    System.out.println("NO");
                    isBal = false;
                    break;
                }
            }
        }
        if (isBal){
            System.out.println("YES");
        }
    }
}
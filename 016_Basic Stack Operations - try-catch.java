package com.DPM
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] three = scan.nextLine().split(" ");
        int nums = Integer.parseInt(three[0]);
        int remove = Integer.parseInt(three[1]);
        int chech = Integer.parseInt(three[2]);
        String[] line = scan.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            stack.push(Integer.parseInt(line[i]));
        }
        for (int i = 0; i < remove; i++) {
            stack.pop();
        }
        boolean cont = stack.contains(chech);
        if (cont){
            System.out.println(cont);
        }else {

            int [] arr = {nums - remove};
            for (int i = 0; i < arr.length; i++) {
                try {
                    arr[i] = stack.poll();
                }
                catch(Exception e) {
                }

            }

            Arrays.sort(arr);
            System.out.println(arr[0]);
        }

    }
}
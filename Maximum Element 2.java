package DPM;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int comands = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < comands; i++) {
            String[] line = scan.nextLine().split("\\s+");
            if (Integer.parseInt(line[0])==1){
                stack.push(Integer.parseInt(line[1]));
            }else if (Integer.parseInt(line[0]) == 2){
                stack.pop();
            }else {
                System.out.println(Collections.max(stack));
            }

        }
    }
}
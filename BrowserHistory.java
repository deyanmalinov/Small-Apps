package com.DPM;
import java.util.*;
public class BrowserHistory {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> web = new ArrayDeque<>();
       String line ;

        while (!"Home".equalsIgnoreCase(line = scan.nextLine())){
            if (!"back".equalsIgnoreCase(line)){
                web.push(line);
                System.out.println(line);
                }else {
                if (web.size()>1){
                    web.pop();
                    System.out.println(web.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }

        }
    }
}
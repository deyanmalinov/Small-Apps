package com.DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] phones = scan.nextLine().split(" ");
        String[] emails = scan.nextLine().split(" ");
        Smartphone note10 = new Smartphone();
        for (String phone : phones) {
            try {
                System.out.println(note10.call(phone));
            }catch (IllegalArgumentException msg){
                System.out.println(msg.getMessage());
            }
        }
        for (String mail : emails) {
            try {
                System.out.println(note10.browse(mail));
            }catch (IllegalArgumentException msg){
                System.out.println(msg.getMessage());
            }
        }
    }
}

public interface Browsable {
    String browse(String site);
}

public interface Callable {
    String call(String number);
}

public class Smartphone implements Browsable, Callable{
    public Smartphone(){
    }
    @Override
    public String browse(String site) {
        if (site.matches(".*\\d+.*")){
            throw new IllegalArgumentException("Invalid URL!");
        }
        return String.format("Browsing: %s!", site);
    }
    @Override
    public String call(String num) {
        if (!num.matches("\\d+")){
            throw new IllegalArgumentException("Invalid number!");
        }
        return String.format("Calling... %s", num);
    }
}
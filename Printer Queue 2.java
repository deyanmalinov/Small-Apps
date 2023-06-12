import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String comand = scan.nextLine();

        while (!"print".equals(comand)){
            if ("cancel".equals(comand)){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled "+ queue.poll());
                }
            }else {
                queue.offer(comand);
            }
            comand = scan.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
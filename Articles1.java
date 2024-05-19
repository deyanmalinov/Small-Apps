package com.DPM;
import java.util.*;
public class Articles1 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String [] line = scan.nextLine().split(", ");
            Articles2 art = new Articles2(line[0], line[1], line[2]);

            int num = Integer.parseInt(scan.nextLine());

            while (num-- > 0){
                String [] comand = scan.nextLine().split(": ");
                String com = comand[0];
                if (com.equals("Edit")){
                    art.edit(comand[1]);
                }else if (com.equals("ChangeAuthor")){
                    art.changeAuthor(comand[1]);
                }else{
                    art.rename(comand[1]);
                }

            }

            System.out.printf("%s - %s: %s", art.getTitle(), art.getContent(), art.getAuthor());
        }
}
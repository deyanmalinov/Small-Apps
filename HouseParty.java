package com.DPM;
import java.util.*;
public class HouseParty {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int lines = Integer.parseInt(scan.nextLine());

            ArrayList <String> line = new ArrayList<>();

            while (lines-- >0){
                String com = scan.nextLine();
                String [] sline = com.split(" ");
                if (!com.contains("not")){
                    String name = sline[0];

                    if (line.contains(name)){
                        System.out.println(name + " is already in the list!");
                    }else {
                        line.add(name);
                    }
                }else{
                    String name = sline[0];
                    if (line.contains(name)){
                        line.remove(name);
                    }else {
                        System.out.println(name + " is not in the list!");
                    }
                }
            }
            for (String name : line) {
                System.out.println(name);
            }
        }
}
package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            List <String> strList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

            String line = scan.nextLine();
            while (!line.equals("end")){

                String [] comTwo = line.split(" ");
                String cmd = comTwo[0];
                line = scan.nextLine();
                if (cmd.equals("Delete")){
                    String  elem = comTwo[1];
                    while (strList.contains(elem)){
                        strList.remove(elem);
                    }
                }else {
                    String elem = comTwo[1];
                    int index = Integer.parseInt(comTwo[2]);
                    if (index<strList.size()) {
                        strList.add(index, elem);
                    }
                }


            }

            System.out.println(strList.toString().replaceAll("[\\[\\],]", ""));
        }
}
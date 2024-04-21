package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class ListOperations {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            List <String> strList = Arrays.stream(scan.nextLine()
                    .split("\\s+"))
                    .collect(Collectors.toList());

            String line = scan.nextLine();

            while (!line.equals("End")){

            String [] comand = line.split("\\s+");
                switch (comand[0]){
                    case "Add":
                        strList.add(comand[1]);
                        break;
                    case "Remove":
                        if (strList.size()>Integer.parseInt(comand[1])){
                            strList.remove(Integer.parseInt(comand[1]));
                        }else {
                            System.out.println("Invalid index");
                        }
                        break;
                    case "Insert":
                        if (strList.size()>Integer.parseInt(comand[2])) {
                            strList.add(Integer.parseInt(comand[2]), comand[1]);
                        }else {
                            System.out.println("Invalid index");
                        }
                        break;
                    case "Shift":
                        if (comand[1].equals("left")){
                            for (int i = 0; i < Integer.parseInt(comand[2]); i++) {
                                strList.add(strList.get(0));
                                strList.remove(0);
                            }
                        }else {
                            for (int i = 0; i < Integer.parseInt(comand[2]); i++) {
                                strList.add(0, strList.get(strList.size()-1));
                                strList.remove(strList.size()-1);
                            }
                        }
                        break;

                }
                line = scan.nextLine();
            }
            for (String s : strList) {
                System.out.print(s+" ");
            }
        }
}
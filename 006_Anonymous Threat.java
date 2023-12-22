package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] line = scan.nextLine().split(" ");

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            strList.add(i, line[i]);
        }

        String data = scan.nextLine();

        while (!data.equals("3:1")){
            String[] comand = data.split(" ");
            if (comand[0].equals("merge")){
                int start = Integer.parseInt(comand[1]);
                int end = Integer.parseInt(comand[2]);
                start = validIndex(start, strList.size());
                end = validIndex(end, strList.size());
                String newElements = String.join("", strList.subList(start, end+1));
                strList.subList(start, end+1).clear();

                    strList.add(start, newElements);

            }else if (comand[0].equals("divide")){
                int index = Integer.parseInt(comand[1]);
                int part = Integer.parseInt(comand[2]);
                List<String> res = delene(strList.get(index), part);
                strList.remove(index);
                strList.addAll(index, res);
            }
            data = scan.nextLine();

        }
        for (String s : strList) {
            System.out.print(s + " ");
        }
    }
    private static List<String> delene(String ele, int part) {

        int part1 = ele.length() / part;

        ArrayList<String> res = new ArrayList<>();

        while (ele.length() >= part1){
            res.add(ele.substring(0, part1));
            ele = ele.substring(part1);
        }
        if (res.size() == part){
            return res;
        }else {
            String concLTele = res.get(res.size() -2).concat(res.get(res.size()-1));
            res.subList(res.size() -2, res.size()).clear();
            res.add(concLTele);
            return res;
        }
    }
    private static int validIndex (int index, int lenght){

        if (index<0){
            index=0;
        }
        if (index>lenght-1){
            index = lenght-1;
        }
        return index;
    }
}
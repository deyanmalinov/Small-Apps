package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            List<Integer> listArr1 = Arrays.stream(scan.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> listArr2 = Arrays.stream(scan.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int size = Math.min(listArr1.size(), listArr2.size());

            List <Integer> finalList = new ArrayList<>();


            for (int i = 0; i < size; i++) {

                finalList.add(listArr1.get(i));

                finalList.add(listArr2.get(i));


            }
            if (listArr1.size()>listArr2.size()){
                finalList.addAll(listArr1.subList(size, listArr1.size()));
            }else {
                finalList.addAll(listArr2.subList(size, listArr2.size()));
            }
            System.out.println(finalList.toString().replaceAll("[\\[\\],]", ""));
        }
}
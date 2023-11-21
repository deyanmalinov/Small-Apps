package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            List<Integer> liAr = Arrays.stream(scan.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int setSize = liAr.size()/2;
            for (int i = 0; i < setSize; i++) {
                int newNum = liAr.get(i) + liAr.get(liAr.size()-1);
                liAr.set(i, newNum);
             liAr.remove(liAr.size()-1);

            }
            for (Integer num : liAr) {
                System.out.print(num + " ");
		}
//			System.out.println(liAr.toString().replaceAll("[\\[\\],]", ""));

        }
}
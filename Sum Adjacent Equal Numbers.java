package com.company;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    private int nums;

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String [] strArr = scan.nextLine().split(" ");
            ArrayList<Double> intList = new ArrayList<>();

            for (String num : strArr) {
            intList.add(Double.parseDouble(num));

        }
//			List<Double> intList = Arrays.stream(scan.nextLine().split(" "))
//			.map(Double::parseDouble).collect(Collectors.toList());

//            for (int i = 0; i < strArr.length; i++) {
//                double num = Double.parseDouble(strArr[i]);
//                intList.add(num);
//            }

            for (int i = 0; i < intList.size()-1; i++) {


            if (intList.get(i).equals(intList.get(i+1))){
                intList.set(i, intList.get(i)+(intList.get(i+1)));
                intList.remove(i+1);
                i=-1;
            }

        }
        DecimalFormat form = new DecimalFormat("#.###");
        for (Double num : intList) {
            
            System.out.print(form.format(num)+" ");

        }


    }
}
package com.DPM;
import java.util.*;
import java.util.stream.Collectors;
public class AverageOfDoubles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<Double> nums = Arrays.stream(scan.nextLine().split(" "))
                .filter(num -> !num.isEmpty())
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        OptionalDouble aver = nums.stream()
                .mapToDouble(Double::valueOf)
                .average();

        if (aver.isPresent()){
            System.out.printf("%.2f",aver.getAsDouble());
        }else {
            System.out.println("No match");
        }
    }
}
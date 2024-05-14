package com.DPM;
import java.util.Scanner;
import java.util.function.Function;
public class StringArrToIntegerArrWithFunction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        Function<String, Integer> parse = str -> Integer.parseInt(str);

        Integer[] newArr = new Integer[line.length];

        for (int i = 0; i < line.length; i++) {
            newArr[i] = parse.apply(line[i]);
        }
        for (Integer integer : newArr) {
            System.out.print(integer+" ");
        }
    }
}
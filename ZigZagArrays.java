package com.DPM;
import java.util.*;
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        int [] fArr = new int[lines];
        int [] sArr = new int[lines];

        for (int i = 0; i < lines; i++) {
           int pChis = scan.nextInt();
           int vtChis = scan.nextInt();
           if(i==0) {
               fArr[i] = pChis;
               sArr[i] = vtChis;
           }else if (i%2!=0) {
               fArr[i] = vtChis;
               sArr[i] = pChis;
           }else {
               fArr[i] = pChis;
               sArr[i] = vtChis;
           }
        }
        for (int ff:fArr) {
            System.out.print(ff+" ");

        }
        System.out.println();
        for (int ss:sArr) {
            System.out.print(ss+" ");

        }
    }
}
package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long fnum = Long.parseLong(scan.nextLine());
            long snum = Long.parseLong(scan.nextLine());
            long tnum = Long.parseLong(scan.nextLine());
            long cnum = Long.parseLong(scan.nextLine());

            long sum = fnum + snum;
            long dev = sum / tnum;
            long sumF = dev*cnum;
            System.out.println(sumF);
    }

}
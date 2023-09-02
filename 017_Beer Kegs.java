package com.DPM;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beerNum = Integer.parseInt(scan.nextLine());
        String beerName, bearNameBig="";
        double rad, volume, bigVolume=0;
        int hig;
        while (beerNum>0){
            beerName = scan.nextLine();
            rad = Double.parseDouble(scan.nextLine());
            hig = Integer.parseInt(scan.nextLine());
            volume = Math.PI * rad*rad * hig;
            if (volume>bigVolume){
                bigVolume=volume;
                bearNameBig=beerName;

            }
            beerNum--;
        }
        System.out.println(bearNameBig);

    }
}
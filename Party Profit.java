package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int party = Integer.parseInt(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());

            int coin = days*50;

            for (int i = 1; i <= days; i++) {
                coin -= party*2;

                if (i % 10 == 0){
                    party-=2;
                }
                if (i % 15 == 0){
                    party+=5;
                }
                if (i % 3 == 0){
                    coin -= party*3;
                }
                if (i % 5 == 0){
                    coin += party*20;
                    if (i % 3 == 0){
                        coin -= party*2;
                    }

                }

            }
            double fin = Math.floor(coin/party);

            System.out.printf("%d companions received %.0f coins each.", party, fin);


        }

}
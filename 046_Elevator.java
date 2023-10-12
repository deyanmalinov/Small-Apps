package com.DPM;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numPeople = Integer.parseInt(scan.nextLine());
            int capasiti = Integer.parseInt(scan.nextLine());

            int cours = numPeople / capasiti;
            int cous = numPeople % capasiti;
            if (cous!=0){
                cours++;
            }
            System.out.println(cours);
    }

}
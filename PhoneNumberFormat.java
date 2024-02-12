package com.DPM;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        //        phone number format  (123) 456-789-101112
        int[] arr = {3, 5, 9, 8, 8, 4, 4, 4, 6, 8, 6, 4};
        StringBuilder string = new StringBuilder();

        for (int i : arr) {
            string.append(i);
        }
        System.out.println(string);
        System.out.println("(" + string.substring(0,3) + ")" + " " +
                string.substring(3,6)+"-" + string.substring(6,9)+"-"+
                string.substring(9,12));
    }
}

package com.DPM;

public class SpecialArrays {
    public static void main(String[] args) {
        int[] arrayA = {2, 5, 6, 7};
        int[] arrayB = {2, 4, 6, 8};

        System.out.println("Is array1 special? " + isSpecial(arrayA));
        System.out.println("Is array2 special? " + isSpecial(arrayB));
    }

    public static boolean isSpecial(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0 && array[i] % 2 != 0) {
                return false;
            }

            else if (i % 2 != 0 && array[i] % 2 == 0) {
                return false;
            }
        }
        return true;

    }
}

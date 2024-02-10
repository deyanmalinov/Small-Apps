package com.DPM;

public class SpecialArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 6, 7};
        int[] array2 = {2, 4, 6, 8};

        System.out.println("Is array1 special? " + isSpecial(array1));
        System.out.println("Is array2 special? " + isSpecial(array2));
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

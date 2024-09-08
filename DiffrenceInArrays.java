package com.DPM;
public class DiffrenceInArrays {
    public static void main(String[] args) {

        int[] array = {10, 5, 3, 8, -15};

        int difference = findDifference(array);

        System.out.println("Difference " + difference);
    }

    public static int findDifference(int[] array) {

        int min = array[0];

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        int difference = max - min;

        return difference;
    }
}

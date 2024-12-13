package com.DPM;
public class Variations {

        static int a = 3;

        static int b = 4;

        static int[] mainArr = new int[a];

        static int[] tempArr = new int[]{1, 2, 3, 4};

        public static void main(String[] args) {
            Gen(0);
            Swap(a, b);
        }
        private static void Gen(int index) {
            if (index >= a){
                Print();
            }else {
                for (int i = index; i < b; i++) {
                    mainArr[index] = tempArr[i];
                    Swap(tempArr[i], tempArr[index]);
                    Gen(index + 1);
                    Swap(tempArr[i], tempArr[index]);
                }
            }
        }
        static void Swap(int ind1, int ind2){
            int temp = ind1;
            ind1 = ind2;
            ind2 = temp;
        }
        static void Print(){
            for (int i : mainArr) {
                System.out.print(i + " ");
            }
        System.out.println();
    }
}

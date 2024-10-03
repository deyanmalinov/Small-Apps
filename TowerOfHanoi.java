package com.DPM;
import java.util.ArrayDeque;
public class TowerOfHanoi {
    public static void main(String[] args){

        ArrayDeque<Integer> first = new ArrayDeque<>();

        first.push(3);
        first.push(2);
        first.push(1);

        ArrayDeque<Integer> spare = new ArrayDeque<>();

        ArrayDeque<Integer> last = new ArrayDeque<>();

        int disk = 3;

        Move(3, first, spare, last);

        for (Integer integer : last) {
            System.out.println(integer);
        }
    }
    private static void Move(int disk, ArrayDeque<Integer> first, ArrayDeque<Integer> spare, ArrayDeque<Integer> last) {
        if (disk < 1) {
            return;
        }else {
            Move(disk -1, first,last,spare);
            last.push(disk);
            first.pop();
            Move(disk -1, spare,first,last);
        }
    }
}

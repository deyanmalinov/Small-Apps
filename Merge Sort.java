package com.DPM;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{5,6,2,8,1,9,3,4};
        Sort(nums, 0, nums.length - 1);
        Print(nums);

    }

    private static void Sort(int[] nums, int startInd, int endInd) {
        //Arrays.sort(nums);
        if (startInd >= endInd){
            return;
        }
            int midInd = (startInd + endInd) / 2;

            Sort(nums, startInd, midInd);

            Sort(nums, midInd + 1, endInd);

            Merge(nums, startInd, midInd, endInd);
    }

    private static void Merge(int[] nums, int startInd, int midInd, int endInd) {
        if (midInd < 0 || midInd + 1 >= nums.length || nums[midInd] <= nums[midInd + 1]) {
            return;
        }
        int[] tempNums = new int[nums.length];

        for (int i = startInd; i <= endInd; i++) {
            tempNums[i] = nums[i];
        }
        int leftInd = startInd;
        int rightInd = midInd+1;

        for (int i = startInd; i <= endInd; i++) {
            if (leftInd > midInd) {
                nums[i] = tempNums[rightInd++];
            } else if (rightInd > endInd) {
                nums[i] = tempNums[leftInd++];
            } else if (tempNums[leftInd] <= tempNums[rightInd]) {
                nums[i] = tempNums[leftInd++];
            } else {
                nums[i] = tempNums[rightInd++];
            }
        }
    }
    private static void Print(int[] nums){
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
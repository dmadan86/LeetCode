package com.leetcode;

/**
 * Created by mdeivasi on 27/11/16.
 */
public class TwoSum {
    public static void main(String args[]) {
        int[] numArray = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = brutal_way(numArray, target);



    }

    //Brutal force way o(n^2) - not acceptable
    static int[] brutal_way(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}

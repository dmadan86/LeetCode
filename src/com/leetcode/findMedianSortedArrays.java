package com.leetcode;

import java.util.Hashtable;

/**
 * Created by mdeivasi on 29/11/16.
 */
public class findMedianSortedArrays {
    public static void main(String args[]) {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        float result = solve(num1, num2); //3

        num1 = new int[]{1, 2};
        num2 = new int[]{3, 4};
        result = solve(num1, num2); //3

    }

    private static float solve(int[] num1, int[] num2) {
        float count = 0, result = 0, result1 = 0;

        for (int i = 0; i < num1.length; i++) {
            result += num1[i];
        }


        for (int i = 0; i < num2.length; i++) {
            result1 += num2[i];
        }

        count = ((result / num1.length) + (result1 / num2.length)) / 2;

        return count;
    }
}

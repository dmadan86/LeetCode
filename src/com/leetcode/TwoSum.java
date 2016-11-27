package com.leetcode;

import java.util.*;

/**
 * Created by mdeivasi on 27/11/16.
 * https://leetcode.com/articles/two-sum/#approach-2-two-pass-hash-table-accepted
 */
public class TwoSum {
    public static void main(String args[]) {
        int[] numArray = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = brutal_way(numArray, target);

        result = using_hashtable(numArray, target);
        result = using_hashtable_oneshot(numArray, target);
    }

    //Brutal force way o(n^2) - not acceptable
    private static int[] brutal_way(int[] arr, int target) {
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

    //using hash table o(2n)
    private static int[] using_hashtable(int[] arr, int target) {
        Hashtable availableNumbers = new Hashtable();
        int[] result = new int[2];
        int next_number = 0;

        for (int i = 0; i < arr.length; i++) {
            availableNumbers.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            next_number = target - arr[i];
            if (availableNumbers.containsKey(next_number)) {
                result[0] = (int) availableNumbers.get(next_number);
                result[1] = i;
                return result;
            }
        }

        return null;
    }

    //using hash table o(n)
    private static int[] using_hashtable_oneshot(int[] arr, int target) {
        Hashtable availableNumbers = new Hashtable();
        int[] result = new int[2];
        int next_number = 0;

        for (int i = 0; i < arr.length; i++) {
            next_number = target - arr[i];
            if (availableNumbers.containsKey(next_number)) {
                result[0] = i;
                result[1] = (int) availableNumbers.get(next_number);
                return result;
            }
            availableNumbers.put(arr[i], i);
        }

        return null;
    }
}

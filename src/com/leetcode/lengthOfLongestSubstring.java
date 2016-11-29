package com.leetcode;

import java.util.*;

/**
 * Created by mdeivasi on 27/11/16.
 */
public class lengthOfLongestSubstring {

    public static void main(String args[]) {
        int result = solve("abcabcbb"); //3
        result = solve("bbbb"); //1
        result = solve("pwwkew"); //3
    }

    private static int solve(String s) {
        String current = "", next = "";
        char[] chr = s.toCharArray();
        Hashtable<Character, Integer> hash = new Hashtable<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!hash.containsKey(chr[i])) {
                hash.put(chr[i], 1);
            } else if (hash.get(chr[i]) == 1) {
                hash.put(chr[i], 2);
                count++;
            }
        }
        return count;
    }
}

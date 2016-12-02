package com.leetcode;

/**
 * Created by mdeivasi on 02/12/16.
 * https://leetcode.com/problems/reverse-integer/
 */
public class Reverse_Integer {

    public static void main(String args[]) {
        int result = reverse(321); //3
        result = reverse(-123); //1
        result = reverse(6722883); //3
    }


    private static int reverse(int x) {
        int y = 0,index=0;
        while(x!=0){
            y= y*10 + x%10;
            x =x/10;
            index++;
        }

        return y;
    }
}

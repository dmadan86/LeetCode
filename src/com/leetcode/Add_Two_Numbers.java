package com.leetcode;

/**
 * Created by mdeivasi on 27/11/16.
 */
public class Add_Two_Numbers {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, next = null;

        while (l1 != null && l2 != null) {
            if (result == null) {
                result = new ListNode(l1.val + l2.val);
                next = result;
            } else {
                next = next.next = new ListNode((l1.val + l2.val) % 10);
            }
            l1 = l2.next;
            l2 = l2.next;
        }

        return result;
    }
}

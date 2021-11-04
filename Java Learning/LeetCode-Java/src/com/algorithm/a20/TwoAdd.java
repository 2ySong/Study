package com.algorithm.a20;

/**
 * @Author: Song-zy
 * @Date: 2021/9/24 19:29
 * @Description: 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 */
public class TwoAdd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(12);
        ListNode l2 = new ListNode(123);
        System.out.println(Solution_02.addTwoNumbers(l1,l2).val);
    }
}

class Solution_02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode cur = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = s / 10;
            cur.next = new ListNode(s % 10);
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
            return val;
    }
}


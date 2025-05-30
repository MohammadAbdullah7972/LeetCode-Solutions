/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        if (cur == null || cur.next == null) {
            return head;
        }

        while (cur != null) {
            ListNode tempCon = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempCon;

        }
        return prev;
    }
}
// @lc code=end


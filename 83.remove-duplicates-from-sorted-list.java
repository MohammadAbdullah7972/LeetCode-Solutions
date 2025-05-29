/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start

import java.lang.classfile.components.ClassPrinter.ListNode;
//   Definition for singly-linked list.
// public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

// [Linked List/ Easy]
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;

        // ListNode cur = head;
        // if (head == null || head.next == null) return head;

        // while (cur != null && cur.next != null) {
        // if (cur.val == cur.next.val) {
        // cur.next = cur.next.next;
        // } else{
        // cur = cur.next;
        // }
        // }
        // return head;

    }
}
// @lc code=end

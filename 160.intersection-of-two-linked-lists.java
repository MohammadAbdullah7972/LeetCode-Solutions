/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int listA = getListLength(headA);
        int listB = getListLength(headB);

        while (listA > listB) {
            listA--;
            headA = headA.next;
        }

        while(listB > listA){
            listB--;
            headB = headB.next;
        }

        return headA;
    }

    private int getListLength(ListNode head){
        int length = 0;

        while(head != null){
            length++;
            head = head.next;
        }

        return length;
    }







}
// @lc code=end


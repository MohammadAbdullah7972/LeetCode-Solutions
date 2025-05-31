/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 * [Linked List/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/reverse-linked-list/
 * 
 * Approaches:
 * 1. Recursive (Current implementation)
 * 2. Iterative (Commented alternative)
 * 
 * Time Complexity: O(n) - Visits each node exactly once
 * Space Complexity:
 *   - Recursive: O(n) stack space
 *   - Iterative: O(1) constant space
 * 
 * Explanation:
 * The solution reverses a singly-linked list using either:
 * 
 * Recursive Approach:
 * 1. Base case: empty list or single node
 * 2. Recursively reverse the rest of the list
 * 3. Make current node point to itself in reverse direction
 * 4. Return new head from deepest recursion
 * 
 * Iterative Approach (Commented):
 * 1. Use three pointers: prev, current, and next
 * 2. Traverse while flipping the direction of each link
 * 3. Return prev as the new head
 * 
 * Example:
 * Input: 1 → 2 → 3 → 4 → 5 → NULL
 * Output: 5 → 4 → 3 → 2 → 1 → NULL
 */

// @lc code=start
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
        // Recursive approach
        if (head == null || head.next == null) {
            return head;
        }
        
        // Reverse the rest of the list recursively
        ListNode newHead = reverseList(head.next);
        
        // Make next node point to current node
        head.next.next = head;
        // Break the original link
        head.next = null;
        
        return newHead;

        /*
        // Iterative approach
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next; // Save next node
            current.next = prev;             // Reverse link
            prev = current;                   // Move prev forward
            current = nextTemp;               // Move current forward
        }
        
        return prev; // New head
        */
    }
}
// @lc code=end
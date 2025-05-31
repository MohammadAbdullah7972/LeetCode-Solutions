/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 * [Linked List/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
 * The solution removes duplicates from a sorted linked list by either:
 * 
 * Recursive Approach:
 * 1. Base case: empty list or single node
 * 2. Recursively process the rest of the list
 * 3. Compare current node with next node:
 *    - If values match, skip current node
 *    - Otherwise keep current node
 * 
 * Iterative Approach (Commented):
 * 1. Use a pointer to traverse the list
 * 2. When consecutive nodes have same value,
 *    adjust pointers to skip the duplicate
 * 
 * Example:
 * Input: 1 → 1 → 2 → 3 → 3
 * Output: 1 → 2 → 3
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
    public ListNode deleteDuplicates(ListNode head) {
        // Recursive approach
        if (head == null || head.next == null)
            return head;
        
        // Process rest of the list recursively
        head.next = deleteDuplicates(head.next);
        
        // Skip current node if it's duplicate of next
        return head.val == head.next.val ? head.next : head;

        /* 
        // Alternative iterative approach
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip duplicate
            } else {
                current = current.next; // Move to next node
            }
        }
        return head;
        */
    }
}
// @lc code=end
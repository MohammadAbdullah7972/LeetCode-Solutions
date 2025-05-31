/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/remove-element/
 * 
 * Approach: Two Pointers (In-place Modification)
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Constant extra space used
 * 
 * Explanation:
 * This solution efficiently removes all instances of 'val' from the array using
 * the two-pointer technique:
 * - Pointer 'i' (fast pointer) traverses the array to examine each element
 * - Pointer 'j' (slow pointer) tracks the position for the next valid element
 * 
 * When nums[i] is different from 'val', it's copied to nums[j] and 'j' is incremented.
 * The returned 'j' represents the new length of the array without 'val' elements.
 * 
 * Note: The order of elements may be changed and elements beyond 'j' are irrelevant.
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize slow pointer
        int j = 0;
        
        // Fast pointer scans the entire array
        for (int i = 0; i < nums.length; i++) {
            // If current element is not the value to remove
            if (nums[i] != val) {
                nums[j] = nums[i]; // Keep the element
                j++;               // Move slow pointer forward
            }
            // Else: skip the element (automatically handled by i++)
        }
        
        // j now represents the count of elements not equal to val
        return j;
    }
}
// @lc code=end
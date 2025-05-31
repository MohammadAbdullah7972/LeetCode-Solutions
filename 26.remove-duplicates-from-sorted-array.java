/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Approach: Two Pointers (In-place Modification)
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Constant extra space used
 * 
 * Explanation:
 * This solution uses a two-pointer technique where:
 * - Pointer 'i' traverses the array to find next unique element
 * - Pointer 'j' tracks the position for the next unique element
 * 
 * Since the array is sorted, duplicates appear consecutively. When nums[i] differs
 * from its predecessor, it's copied to nums[j], and 'j' is incremented.
 * 
 * The returned 'j' represents the count of unique elements, and the first 'j'
 * positions contain these unique elements in order.
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;
        
        // Initialize slow pointer (j starts at 1 because nums[0] is always unique)
        int j = 1;
        
        // Fast pointer (i) scans the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // When current element differs from previous, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // Store unique element at j
                j++;               // Move slow pointer forward
            }
        }
        
        // j now represents the count of unique elements
        return j;
    }
}
// @lc code=end
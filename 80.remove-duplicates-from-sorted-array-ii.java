/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 * [Array/ Medium]
 * 
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * Approach: Two Pointers with Allowed Duplicates Check
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - In-place modification with constant extra space
 * 
 * Explanation:
 * This solution extends the standard two-pointer technique to allow at most 2 duplicates:
 * 1. We start both pointers at index 2 (first two elements can always stay)
 * 2. For each subsequent element, we compare with the element two positions back
 *    - If same: skip (would make 3 duplicates)
 *    - If different: keep and move slow pointer
 * 
 * Key Insight: By comparing with nums[slow-2], we automatically check if adding
 * the current element would violate the 2-duplicate rule.
 * 
 * Example:
 * Input: [1,1,1,2,2,3]
 * Process:
 * - Keep first two 1's (allowed)
 * - Skip third 1 (would make three)
 * - Keep both 2's
 * - Keep single 3
 * Result: [1,1,2,2,3] with length 5
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // Early return for small arrays
        if (nums.length <= 2) return nums.length;
        
        int slow = 2; // Start from third element
        
        for (int fast = 2; fast < nums.length; fast++) {
            // Compare current element with two positions before slow pointer
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast]; // Keep the element
                slow++; // Move slow pointer
            }
            // Else: skip the element (would make 3+ duplicates)
        }
        return slow; // New length
    }
}
// @lc code=end
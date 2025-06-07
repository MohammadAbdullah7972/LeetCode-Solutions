/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 * [Array/ Medium]
 * 
 * Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * Approach: Two Pointers
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Constant space used
 * 
 * Explanation:
 * This solution leverages the sorted property of the array using two pointers:
 * 1. Initialize pointers at both ends (left=0, right=length-1)
 * 2. While left < right:
 *    - Calculate current sum = numbers[left] + numbers[right]
 *    - If sum equals target: return 1-indexed positions
 *    - If sum > target: move right pointer left (to reduce sum)
 *    - If sum < target: move left pointer right (to increase sum)
 * 
 * Key Insight: The sorted array property allows efficient adjustment of pointers
 * without missing potential pairs.
 * 
 * Example:
 * Input: numbers = [2,7,11,15], target = 9
 * Process:
 * - 2+15=17 > 9 → right--
 * - 2+11=13 > 9 → right--
 * - 2+7=9 = target → return [1,2]
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right]; 
            
            if (sum == target) {
                // Return 1-indexed positions
                return new int[]{left + 1, right + 1}; 
            } else if (sum > target) {
                // Reduce sum by moving right pointer left
                right--;
            } else {
                // Increase sum by moving left pointer right
                left++;
            }
        }
        
        // No solution found (though problem guarantees exactly one solution)
        throw new IllegalArgumentException("No solution found");
    }
}
// @lc code=end
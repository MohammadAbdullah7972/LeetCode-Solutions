/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/two-sum/
 * 
 * Approach: Brute Force
 * 
 * Time Complexity: O(n²) - Nested loops checking all possible pairs
 * Space Complexity: O(1) - No additional space used except for result
 * 
 * Explanation:
 * This solution uses a brute force approach with nested loops to check every
 * possible pair of numbers in the array. The outer loop runs from the first
 * element to the last, while the inner loop runs from the current element of
 * the outer loop to the end. When a pair summing to the target is found,
 * their indices are returned immediately.
 * 
 * Note: While simple, this approach is not optimal for large arrays. A more
 * efficient O(n) solution would use a HashMap to store seen values.
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop: iterate through each element
        for(int i=0; i<nums.length;i++){
            // Inner loop: check current element against all following elements
            for(int j=i+1; j<nums.length; j++){  // Fixed: j should start from i+1 to avoid self-comparison
                // Check if current pair sums to target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        // If no solution found (though problem states there is exactly one)
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end
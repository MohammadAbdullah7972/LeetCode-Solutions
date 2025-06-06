/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * Approach: Sliding Window with HashSet
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(min(n,k)) - Stores at most k+1 elements in HashSet
 * 
 * Explanation:
 * This solution checks for nearby duplicates using a sliding window approach:
 * 1. Maintains a HashSet for the current window of size k
 * 2. For each element:
 *    - If already in set, duplicate found within window
 *    - Add current element to window
 *    - If window size exceeds k, remove oldest element (nums[i-k])
 * 
 * Key Insight: By maintaining a window of the last k elements, we efficiently
 * check for duplicates within the required distance without nested loops.
 * 
 * Example:
 * Input: nums = [1,2,3,1], k = 3
 * Process:
 * - Window: [1] → [1,2] → [1,2,3] → [2,3,1] (duplicate found)
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Check for duplicate in current window
            if (window.contains(nums[i])) {
                return true;
            }
            
            // Add current element to window
            window.add(nums[i]);
            
            // Maintain window size of k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}
// @lc code=end
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/contains-duplicate/
 * 
 * Approach: HashSet Tracking
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(n) - Worst case stores all elements in HashSet
 * 
 * Explanation:
 * This solution efficiently checks for duplicates using a HashSet:
 * 1. Iterates through each number in the array
 * 2. Attempts to add each number to a HashSet
 *    - If add fails (number exists), returns true immediately
 *    - If all numbers added successfully, returns false
 * 
 * Key Insight: HashSet's add() operation returns false for duplicates,
 * giving us O(1) time complexity for duplicate checks.
 * 
 * Example:
 * Input: [1,2,3,1]
 * Process:
 * - Adds 1, 2, 3 to HashSet
 * - Fails to add second 1 → returns true
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Initialize HashSet to track seen numbers
        Set<Integer> seenNumbers = new HashSet<>();
        
        // Iterate through all numbers
        for (int num : nums) {
            // If number already exists in set
            if (!seenNumbers.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }
}
// @lc code=end
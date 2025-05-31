/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/search-insert-position/
 * 
 * Approach: Binary Search
 * 
 * Time Complexity: O(log n) - Standard binary search efficiency
 * Space Complexity: O(1) - Constant space used
 * 
 * Explanation:
 * This solution performs a standard binary search with modifications to find the
 * insertion position when the target is not found:
 * 1. If target is found, returns its index immediately
 * 2. If not found, the loop exits when left > right, and 'left' indicates the
 *    position where the target should be inserted
 * 
 * Key Insight: The insertion position is always the 'left' index when the search
 * terminates, as it represents the first position where the array element is
 * greater than the target.
 * 
 * Example: For [1,3,5,6] and target=2:
 * - The search would end with left=1, right=0
 * - Correct insertion position is 1 (between 1 and 3)
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize pointers (note right starts at nums.length, not nums.length-1)
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Prevent integer overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // Target found at mid
                return mid;
            } else if (nums[mid] > target) {
                // Search left half
                right = mid - 1;
            } else {
                // Search right half
                left = mid + 1;
            }
        }
        
        // Target not found, return insertion position
        return left;
    }
}
// @lc code=end
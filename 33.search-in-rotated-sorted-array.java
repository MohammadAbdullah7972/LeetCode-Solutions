/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 * [Array/ Medium]
 * 
 * Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 
 * Approach: Modified Binary Search
 * 
 * Time Complexity: O(log n) - Standard binary search efficiency
 * Space Complexity: O(1) - Constant space used
 * 
 * Explanation:
 * This solution performs a modified binary search to handle the rotated array:
 * 1. First checks if the middle element is the target
 * 2. Determines which half (left or right of mid) is properly sorted
 * 3. Checks if target lies within the sorted half:
 *    - If yes, searches that half
 *    - If no, searches the other half
 * 
 * Key Insight: At least one half of the array (left or right of mid) will always 
 * be properly sorted, even in a rotated array.
 * 
 * Example: For [4,5,6,7,0,1,2] and target=0:
 * - First identifies that left half (4-7) is sorted but target isn't there
 * - Then searches right half where the rotation point exists
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // Edge case: single element array
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    // Target is in sorted left half
                    right = mid - 1;
                } else {
                    // Target is in unsorted right half
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    // Target is in sorted right half
                    left = mid + 1;
                } else {
                    // Target is in unsorted left half
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }
}
// @lc code=end
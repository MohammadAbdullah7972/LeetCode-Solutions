/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/merge-sorted-array/
 * 
 * Approach: Three Pointers (Backward Merge)
 * 
 * Time Complexity: O(m+n) - Single pass through both arrays
 * Space Complexity: O(1) - In-place modification, no extra space
 * 
 * Explanation:
 * This solution merges two sorted arrays into nums1 by:
 * 1. Using three pointers starting from the ends:
 *    - i: last element of nums1's valid elements (m-1)
 *    - j: last element of nums2 (n-1)
 *    - k: last position of merged array (m+n-1)
 * 2. Comparing elements from both arrays and placing the larger one at k
 * 3. Handling remaining elements in nums2 if any
 * 
 * Key Insight: By merging backward, we avoid overwriting unprocessed elements
 * in nums1 while efficiently utilizing the available space.
 * 
 * Example:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6], n = 3
 * 
 * Process:
 * 1. Compare 3 (nums1) and 6 (nums2) → place 6
 * 2. Compare 3 and 5 → place 5
 * 3. Compare 3 and 2 → place 3
 * 4. Compare 2 and 2 → place 2
 * 5. Copy remaining 2 from nums1
 * Result: [1,2,2,3,5,6]
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers
        int i = m - 1; // nums1's last valid element
        int j = n - 1; // nums2's last element
        int k = m + n - 1; // merged array's last position

        // Merge while both arrays have elements
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Place nums1's element
                i--;
            } else {
                nums1[k] = nums2[j]; // Place nums2's element
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 if any
        while (j >= 0) {
            nums1[k]= nums2[j];
            j--;
            k--;
        }
    }
}
// @lc code=end
/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 * [Array/ Medium]
 */
// Array [4,5,6,7, 0,1,2]

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = (left + right) /2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target > nums[mid] || target < nums[left] ) {
                    left = mid +1;
                } else {
                    right = mid-1;
                }
            } else {
                if (target < nums[mid] || target > nums[right]) {
                    right = mid-1;
                } else {
                    left = mid +1;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

// Array [4,5,6,7, 0,1,2]

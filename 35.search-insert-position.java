/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 * [Array/ Easy]
 */
// [1,3,5,6]
// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else{
                left = mid+1;
            }
        } return left;
    }
}
// @lc code=end


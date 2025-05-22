/*
 * @lc app=leetcode id=26 lang=java
 *
 * [27] Remove Element
 * [Array/ Easy]
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        } return j;
    }
}
// @lc code=end


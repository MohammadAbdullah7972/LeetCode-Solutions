/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2;
        for(int fast=2; fast<nums.length; fast++){
            if(nums[slow-2] == nums[fast]){
                continue;
            } else {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
// @lc code=end


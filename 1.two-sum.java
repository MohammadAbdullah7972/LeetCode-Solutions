/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 * [Array/ Easy]
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i; j<nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("");
    }
}
// @lc code=end


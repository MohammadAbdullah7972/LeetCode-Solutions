/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> wind = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if (wind.contains(nums[i])) {
                return true;
            }
            wind.add(nums[i]);

            if (wind.size() > k) {
                wind.remove(nums[i-k]);
            }
        }
        return false;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 * [Array/ Easy]
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> container = new HashSet<>();

        for (Integer number : nums) {
            if (!container.add(number)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/single-number/
 * 
 * Approach: Bit Manipulation (XOR)
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Constant space used
 * 
 * Explanation:
 * This solution leverages the properties of XOR operation:
 * 1. XOR of a number with itself is 0 (a ^ a = 0)
 * 2. XOR of a number with 0 is the number itself (a ^ 0 = a)
 * 3. XOR is commutative and associative (order doesn't matter)
 * 
 * By XOR-ing all numbers together, duplicates cancel out (become 0),
 * leaving only the single number as the result.
 * 
 * Example:
 * Input: [4,1,2,1,2]
 * Calculation:
 * 4 ^ 1 ^ 2 ^ 1 ^ 2
 * = 4 ^ (1 ^ 1) ^ (2 ^ 2)
 * = 4 ^ 0 ^ 0
 * = 4
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // XOR all numbers together
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
// @lc code=end
/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int numbers[] = new int[digits.length + 1];

        for(int i= n-1; i>=0; i--){
            if (digits[i] == 9) {
                digits[i] =0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        numbers[0] = 1;
        return numbers;
    }
}
// @lc code=end


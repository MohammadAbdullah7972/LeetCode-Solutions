/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while (left < right) {
            int cal = numbers[left] + numbers[right]; 
            if (target == cal) {
               return new int[]{left, right}; 
            } else if (cal > target) {
                right--;
            } else{
                left++;
            }
        }
        throw new IllegalArgumentException("No any Input");
    }
}
// @lc code=end


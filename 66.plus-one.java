/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 * [Array/ Easy]
 * 
 * Problem Link: https://leetcode.com/problems/plus-one/
 * 
 * Approach: Schoolbook Addition with Carry
 * 
 * Time Complexity: O(n) - Worst case traverses entire array
 * Space Complexity: O(n) - Only when result needs extra digit (otherwise O(1))
 * 
 * Explanation:
 * This solution simulates how we would add 1 to a number manually:
 * 1. Start from the least significant digit (end of array)
 * 2. If digit is 9, it becomes 0 and we carry over 1
 * 3. If digit is not 9, simply increment it and return
 * 4. If all digits were 9, we need to create a new array with leading 1
 * 
 * Key Insight: The only case requiring array expansion is when all digits are 9,
 * resulting in a number like 999 → 1000 (one digit longer).
 * 
 * Example: 
 * - [1,2,3] → [1,2,4] (simple increment)
 * - [9,9] → [1,0,0] (carry propagation with array expansion)
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse digits from least to most significant
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                // Set current digit to 0 and carry over
                digits[i] = 0;
            } else {
                // Increment digit and return immediately
                digits[i]++;
                return digits;
            }
        }
        
        // If we're here, all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1;  // Set first digit to 1, others remain 0
        return result;
    }
}
// @lc code=end
/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 * [Array/ Medium]
 * 
 * Problem Link: https://leetcode.com/problems/product-of-array-except-self/
 * 
 * Approach: Prefix & Suffix Products
 * 
 * Time Complexity: O(n) - Two passes through the array
 * Space Complexity: O(1) - Output array not counted as extra space
 * 
 * Explanation:
 * This solution efficiently computes the product without division using:
 * 1. Prefix pass (left to right):
 *    - Stores product of all elements to the left of each index
 * 2. Suffix pass (right to left):
 *    - Multiplies each prefix product with product of elements to the right
 * 
 * Key Insight: The product except self is the product of prefix and suffix products
 * for each position, computed in O(n) time without division.
 * 
 * Example:
 * Input: [1,2,3,4]
 * Prefix: [1,1,2,6] (products to left)
 * Suffix: [24,12,4,1] (products to right)
 * Result: [24,12,8,6] (prefix × suffix)
 */

// @lc code=start
class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //     int[] ansNums = new int[nums.length];

    //     for(int i=0; i<nums.length; i++){
    //         ansNums[i] = 1;
    //         for(int j=0; j<nums.length; j++){
    //             if(i != j){
    //                 ansNums[i] *= nums[j];
    //             }
    //         }
    //     }
    //     return ansNums;
    // }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ansNums = new int[n];

        // Calculate prefix products (products to the left of each element)
        ansNums[0] = 1;// No elements to the left of first element
        for(int i=1; i<n; i++){
            ansNums[i] = ansNums[i-1] * nums[i-1];
        }

        // Calculate suffix products and multiply with prefix products
        int suffix = 1; // Initialize suffix product
        for(int i=n-1; i>=0; i--){
            ansNums[i] = ansNums[i] * suffix; // Multiply prefix with suffix
            suffix = suffix * nums[i]; // Multiply prefix with suffix
        }

        return ansNums;
    }
}
// @lc code=end


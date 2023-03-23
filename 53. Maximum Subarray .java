/*  Author: Mitil Jawale
    Date: 2 Jan 2023
    Topic: 53. Maximum Subarray (Leetcode)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : nums) {
            sum += i;
            max = Math.max(sum,max);
            sum = Math.max(0,sum);
        }
        return max;


    }
}
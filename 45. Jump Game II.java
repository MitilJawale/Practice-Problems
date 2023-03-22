/*  Author: Mitil Jawale
    Date:  4 January 2023
    Topic: 45. Jump Game II (Leetcode)
*/

class Solution {
    public int jump(int[] nums) {
        int left = 0;
        int right = 0;
        int minSteps = 0;
        while(right < nums.length - 1) {
            int farthest = 0;
            for(int i=left;i<=right;i++)
                farthest = Math.max(farthest,i + nums[i]);
            left = right + 1;
            right = farthest;
            minSteps += 1;
        }
        
        return minSteps;
    }
}
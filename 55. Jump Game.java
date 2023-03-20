/*  Author: Mitil Jawale
    Date: 19 March 2023
    Topic: 55. Jump Game (Leetcode)
*/

class Solution {
    public boolean canJump(int[] nums) {
    int goal = nums.length - 1;
    for(int i=nums.length-1;i>=0;i--) {
        if(nums[i] + i >= goal)
            goal = i;
    }
    return goal == 0;
    }
}



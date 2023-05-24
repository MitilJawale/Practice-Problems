/*  Author: Mitil Jawale
    Date:  5 Jan 2022
    Topic: 164. Maximum Gap (Leetcode)
*/

class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2)
            return 0;
        Arrays.sort(nums);  // [1,3,6,9]
        for(int i=nums.length-1;i>0;i--) {
            nums[i] -= nums[i-1];
        }
        nums[0] = 0;
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}

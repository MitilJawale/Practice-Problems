/*  Author: Mitil Jawale
    Date:  30 December 2022
    Topic: 2091. Removing Minimum and Maximum From Array (Leetcode)
*/


class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            else if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        if(minIndex < maxIndex) {
            if(minIndex < nums.length-maxIndex && maxIndex-minIndex <= nums.length-maxIndex) 
                return maxIndex+1;
            else if(minIndex + 1 >= maxIndex - minIndex)
                return nums.length - minIndex;
            else
                return (minIndex + nums.length - maxIndex + 1);
        }

        if(maxIndex < minIndex) {
            if(maxIndex < nums.length-minIndex && minIndex-maxIndex <= nums.length-minIndex) 
                return minIndex+1;
            else if(maxIndex + 1 >= minIndex - maxIndex)
                return nums.length - maxIndex;
            else
                return (maxIndex + nums.length - minIndex + 1);
        }

        return 1;
        
    }
}

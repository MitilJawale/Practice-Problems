
/*  Author: Mitil Jawale
    Date:  30 December 2022
    Topic: 75. Sort Colors (Leetcode)
*/

class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int i=0;i<nums.length;i++) {
            switch(nums[i]) {
                case 0: {
                    zeroCount++;
                    break;
                }
                case 1: {
                    oneCount++;
                    break;
                }
                case 2: {
                    twoCount++;
                    break;
                }
            }
        }

        for(int i=0;i<nums.length;i++) {
            if(zeroCount != 0) {
                nums[i] = 0;
                zeroCount--;
            }
            else if(oneCount != 0) {
                nums[i] = 1;
                oneCount--;
            }
            else if(twoCount != 0) {
                nums[i] = 2;
                twoCount--;
            }
        }
        
    }
}
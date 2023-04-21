import java.util.HashMap;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            myMap.put(nums[i], i);
        }
        
        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            if(myMap.containsKey(x) && myMap.get(x) != i) {
                return new int[] {i, myMap.get(x)};
            }
        }
        return null;
    }
}

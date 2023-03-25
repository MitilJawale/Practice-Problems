/*  Author: Mitil Jawale
    Date:  24 December 2022
    Topic: 121. Best Time to Buy and Sell Stock (Leetcode)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int tempProfit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++) {
            min = prices[i] < min ? prices[i] : min;
            tempProfit = prices[i] - min;
            profit =  profit < tempProfit ? tempProfit : profit;
        }
        return profit;
        
    }
}

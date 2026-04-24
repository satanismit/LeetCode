class Solution {
    public int maxProfit(int[] prices) {

        int n= prices.length;

        int minprice =prices[0];

        int profit = 0;

        for(int i=1; i<n; i++){

            //current price - min price so far 
            profit = Math.max(profit, prices[i]-minprice);

            //keep track minprice so far 
            minprice = Math.min(minprice, prices[i]);   
        }

        return profit;
        
    }
}
class Solution {

    public int maxProfit(int[] prices) {

        int n=prices.length;
        int min_price = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        int left = 0, right=0;

        while(right<n){

            if( min_price  > prices[right]){
                min_price = prices[right];
            }

            int profit =  prices[right] -min_price;

            max_profit = Math.max(profit, max_profit);
            right++;
        }

        return max_profit;


        
    }
}
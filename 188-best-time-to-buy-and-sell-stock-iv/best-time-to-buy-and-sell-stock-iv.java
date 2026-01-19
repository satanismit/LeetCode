class Solution {

    public int maxProfit(int val, int[] prices) {
        
    int n = prices.length;

    int[][][] dp =new int[n+1][2][val+1];

    for(int ind = n-1; ind>=0; ind--){

        for(int buy=0; buy<=1; buy++){

            for(int k=1; k<=val; k++){

                int profit = 0;

                if(buy==1){
                int take =  -prices[ind] + dp[ind+1][0][k];
                int notbuy = dp[ind+1][1][k];
                profit = Math.max(profit, Math.max(take, notbuy));

                }else{
                //sell or not sell
                int sell = prices[ind] + dp[ind+1][1][k-1];
                int notsell = dp[ind+1][0][k];
                profit = Math.max(profit, Math.max(sell, notsell));

                }

                dp[ind][buy][k]= profit;

            }
        }
    }

    return dp[0][1][val];
    }
}
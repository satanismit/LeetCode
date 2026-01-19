class Solution {

   //tabulation 
    public int solve(int[] prices, int n, int[][] dp){

    for(int ind = n-1; ind>=0; ind--){

        for(int buy=0; buy<=1; buy++){

            int profit = 0;

            if(buy==1){
                //take or not take 
                // buy or not buy

                int take =  -prices[ind] + dp[ind+1][0];
                int notbuy = dp[ind+1][1];
                profit = Math.max(profit, Math.max(take, notbuy));

            }else{

                //sell or not sell
                int sell = prices[ind] + dp[ind+1][1];
                int notsell = dp[ind+1][0];
                profit = Math.max(profit, Math.max(sell, notsell));

            }

            dp[ind][buy] = profit;
        }
    }
     

    return dp[0][1];

    }

    public int maxProfit(int[] prices) {

    
    int n= prices.length;
    int buy= 1;

    int[][] dp = new int[n+1][2];

    //base 
    dp[n][0]= dp[n][1] =0;

    return solve(prices,n, dp);
        
    }
}
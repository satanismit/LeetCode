class Solution {

   
    public int solve(int[] prices, int ind, int buy, int n, int[][] memo){

    //base case 
    if(ind >= n)  return 0;

     int profit = 0;

     if(memo[ind][buy] != -1)  return memo[ind][buy];

    if(buy==1){
        //take or not take 
        // buy or not buy

        int take = -prices[ind] + solve(prices, ind+1, 0,n, memo);
        int notbuy = solve(prices, ind+1, 1,n, memo);
        profit = Math.max(profit, Math.max(take, notbuy));

    }else{

        //sell or not sell
        int sell = prices[ind] + solve(prices, ind+2, 1,n, memo);  // whenever sell goto ind+2
        int notsell = solve(prices, ind+1, 0,n, memo);
        profit = Math.max(profit, Math.max(sell, notsell));

    }

    return memo[ind][buy]=profit;

    }

    public int maxProfit(int[] prices) {

    int n= prices.length;
    
    int[][] memo = new int[n][2];

    for(int[] rows:memo) Arrays.fill(rows, -1);

    return solve(prices, 0, 1,n, memo);
        
    }
}
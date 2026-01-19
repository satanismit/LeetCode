class Solution {

    public int solve(int[] prices, int ind, int n,int k,int[][] memo){

    //base case 
    if( ind==n || k==4)  return 0;

     int profit = 0;

     if(memo[ind][k] != -1)  return memo[ind][k];

    if(k%2==0){ //buy
        //take or not take 
        // buy or not buy

        int take = -prices[ind] + solve(prices, ind+1, n,k+1, memo);
        int notbuy = solve(prices, ind+1,n,k, memo);
        profit = Math.max(profit, Math.max(take, notbuy));

    }else{

        //sell or not sell
        int sell = prices[ind] + solve(prices, ind+1,n, k+1, memo);
        int notsell = solve(prices, ind+1,n, k, memo);
        profit = Math.max(profit, Math.max(sell, notsell));

    }

    return memo[ind][k]=profit;

    }


    //using only memo[n][4]

    public int maxProfit(int[] prices) {

        int n= prices.length;

        int[][] memo= new int[n][4];

        for(int[] rows:memo){
            Arrays.fill(rows, -1);
        }

        return solve(prices, 0, n,0,memo);


        
    }
}
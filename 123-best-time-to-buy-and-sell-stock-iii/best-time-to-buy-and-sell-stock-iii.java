class Solution {

    public int solve(int[] prices, int ind, int buy, int n,int cap,int[][][] memo){

    //base case 
    if(cap==0) return 0;
    if(ind== n)  return 0;

     int profit = 0;

     if(memo[ind][buy][cap] != -1)  return memo[ind][buy][cap];

    if(buy==1){
        //take or not take 
        // buy or not buy

        int take = -prices[ind] + solve(prices, ind+1, 0,n,cap, memo);
        int notbuy = solve(prices, ind+1, 1,n,cap, memo);
        profit = Math.max(profit, Math.max(take, notbuy));

    }else{

        //sell or not sell
        int sell = prices[ind] + solve(prices, ind+1, 1,n,cap-1, memo);
        int notsell = solve(prices, ind+1, 0,n,cap, memo);
        profit = Math.max(profit, Math.max(sell, notsell));

    }

    return memo[ind][buy][cap]=profit;

    }



    public int maxProfit(int[] prices) {

        int n= prices.length;

        int[][][] memo= new int[n][2][3];

        for(int[][] rows:memo){

            for(int[] cols:rows){

                Arrays.fill(cols, -1);
            }
        }

        return solve(prices, 0, 1, n,2,memo);


        
    }
}
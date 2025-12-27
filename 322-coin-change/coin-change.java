class Solution {

    public static final int MOD = (int) 1e9 + 7; 

    //TABULATION METHOD 
    public int coinChange(int[] coins, int amount) {
        
        if(amount == 0)  return 0;
        int target = amount;

        int n= coins.length;

        int[][] dp = new int[n][amount+1];

        //base case 
        for(int i=0; i<=target; i++){

            if(i%coins[0]==0) {

                dp[0][i]=i/coins[0];
            }else{
                dp[0][i]=MOD;
            }
        }

        // express for ind and target
        for(int i=1; i<n; i++){

            for(int j=0; j<=target; j++){

            int not_take = dp[i-1][j];

            int take = MOD;
            if( coins[i] <= j)  take = 1+dp[i][j-coins[i]];

            dp[i][j] = Math.min(not_take, take);
                
            }
        }
        
        int result = dp[n - 1][target];

        // Return -1 if the target amount cannot be reached with the given coins
        return (result >= MOD) ? -1 : result;


        
    }
}
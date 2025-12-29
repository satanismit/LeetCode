class Solution {

   // memoization 
    // public int solve(int[] coins, int target, int i, int[][] memo) {

    //     if (target == 0) return 1; //we add only when target is 0 
    //     if (i < 0 || target < 0) return 0;       //otherwise 0

    //     if(memo[i][target]!= -1)  return memo[i][target];


    //     int notPick = solve(coins, target, i - 1, memo);
    //     int pick = solve(coins, target - coins[i], i, memo);

    //     return memo[i][target]=pick + notPick;
    // }

    public int change(int amount, int[] coins) {

        int target = amount;
        int n=coins.length;

        int[][] dp = new int[n][amount+1];
    
        //base case 
        for (int i = 0; i < n; i++) dp[i][0] = 1;

        // First coin row
        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[0][j] = 1;
        }

        for(int i=1; i<n; i++){

            for(int j=0; j<=target; j++){

                int notPick = dp[i-1][j];

                int pick =(j >= coins[i])? dp[i][j-coins[i]]: 0; 
                
                dp[i][j]=pick + notPick;

            }
        }

        return dp[n-1][target];
    }
}

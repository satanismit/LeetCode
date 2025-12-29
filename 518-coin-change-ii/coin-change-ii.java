class Solution {

   // memoization 
    public int solve(int[] coins, int target, int i, int[][] memo) {

        if (target == 0) return 1; //we add only when target is 0 
        if (i < 0 || target < 0) return 0;       //otherwise 0

        if(memo[i][target]!= -1)  return memo[i][target];


        int notPick = solve(coins, target, i - 1, memo);
        int pick = solve(coins, target - coins[i], i, memo);

        return memo[i][target]=pick + notPick;
    }

    public int change(int amount, int[] coins) {

        int target = amount;
        int n=coins.length;

        int[][] memo = new int[n][amount+1];

        for(int[] rows:memo)  Arrays.fill(rows, -1);
    
        return solve(coins, amount, n-1, memo);
    }
}

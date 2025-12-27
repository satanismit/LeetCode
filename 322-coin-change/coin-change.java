class Solution {


    public static final int MOD = (int) 1e9 + 7; 

    //memoization
    public int solve(int[] coins, int target, int i,int[][] memo){

        int n=coins.length;

        //base case 
        if(i==0){

            if(target%coins[i]==0)  return target/coins[i];
            else return MOD;
        }

        if(memo[i][target]!=-1)  return memo[i][target];

        //not_take 
        int not_take = solve(coins, target, i-1,memo);

        //take
        int take = MOD;

        if( target>= coins[i])  take = 1+solve(coins, target-coins[i], i,memo);

        return memo[i][target]=Math.min(not_take, take);

    }

    public int coinChange(int[] coins, int amount) {
        
        if(amount == 0)  return 0;
        int target = amount;

        int n= coins.length;

        int[][] memo = new int[n][amount+1];

        for(int[] rows:memo)  Arrays.fill(rows, -1);

        //base case 
       int res = solve(coins, target, n-1,memo);

        return res == MOD ? -1:res ;


        
    }
}
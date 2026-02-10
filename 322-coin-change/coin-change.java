class Solution {

    public static final int MOD = (int) 1e9 + 7;
    int[][] memo;
    //memoization 
    public int solve(int[] coins, int target, int i){

        //base case 
       
        if(i==coins.length-1) { 
             
             if(target%coins[i]==0) return target/coins[i];
             else return MOD;

        }

        if(memo[i][target]!=-1) return memo[i][target];

        //take 
        int take=MOD;
        if(target>=coins[i]){
            take = 1+ solve(coins, target-coins[i], i);
        }

        //not take
        int not_take = solve(coins, target, i+1);

        //min
        return memo[i][target]=Math.min(take, not_take);

    }

    public int coinChange(int[] coins, int amount) {

        int n=coins.length;

         memo = new int[n][amount+1];

         for(int[] rows:memo)  Arrays.fill(rows, -1);

        int res= solve(coins, amount, 0);

        return res>=MOD ? -1 : res;
        
    }
}
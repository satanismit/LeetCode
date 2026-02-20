class Solution {

    int[] memo;  //use Memoization 

    public int solve(int n){

         if(n==0 || n==1) return 1;

         if(memo[n]!=-1)  return memo[n];

        return memo[n]=solve(n-1)+solve(n-2);

    }

    public int climbStairs(int n) {

        memo = new int[n+1];
        Arrays.fill(memo, -1);

        return solve(n);
        
    }


}
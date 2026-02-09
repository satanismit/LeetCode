class Solution {

    // tabulation 

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n= arr.length;

        int[] dp = new int[n+1];

        for(int ind=n-1; ind>=0; ind--){

        int ans=Integer.MIN_VALUE;
        int length=0, currmax= Integer.MIN_VALUE;
        int sum =0;

        for(int j=ind; j<Math.min(arr.length,ind+k); j++){
            length++;

            currmax = Math.max(currmax, arr[j]);
            
            sum = currmax*length + dp[j+1];

            ans = Math.max(ans, sum);
            
        }

        dp[ind]=ans;

        }

        return dp[0];
    }
}
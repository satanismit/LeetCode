class Solution {

    // recursion + Memoization  
    // public int solve(int[] nums,int i,int[] dp){

    //     int n=nums.length;
        
    //     //base case 
    //     if(i>=n){
    //         return 0;
    //     }

    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }

    //     int skip = solve(nums,i+1,dp);
    //     int steal = nums[i] + solve(nums,i+2,dp);

    //     return dp[i]= Math.max(steal, skip);
    // }


    //tabulation method :

    public int solve(int[] nums,int i,int[] dp){

        int n=nums.length;

        if(n==1) return nums[0];
        //starts from the base case 
        dp[0]=nums[0];
        dp[1]= Math.max(nums[0], nums[1]);

        //iterate 
        for(int j=2; j<n; j++){

            int steal = nums[j] + dp[j-2];
            int  skip = dp[j-1];

            dp[j]= Math.max(steal, skip);
        }

        return dp[n-1];
    }
    public int rob(int[] nums) {
        
        int n=nums.length;
        int[] dp = new int[n+1]; 
        
        return solve(nums,0,dp);
    }
}
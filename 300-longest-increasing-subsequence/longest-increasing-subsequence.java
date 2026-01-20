class Solution {

    //tabulation 
    public int lengthOfLIS(int[] nums) {

        int n= nums.length;

        int[][] dp = new int[n+1][n+1];

        //start from base case 

        for(int ind= n-1; ind>=0; ind--){

            for(int prevind=ind-1; prevind>=-1; prevind--){

                int take = 0;

                if(prevind==-1 || nums[prevind]<nums[ind]){
                    take =1+ dp[ind+1][ind+1];
                }

                int nottake = dp[ind+1][prevind+1];

                dp[ind][prevind+1] = Math.max(take, nottake);
            }
        }

        return dp[0][0];

        

        


        
    }
}
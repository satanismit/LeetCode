class Solution {

    // Tabulation  TC = O( n^3 ) ,sc = O(n^2) 
    
    public int maxCoins(int[] nums) {

        int n= nums.length;

        int[] arr=new int[n+2];

        System.arraycopy(nums, 0, arr, 1, n);
        arr[0]=1;
        arr[n+1]=1;

       int[][] dp = new int[n+2][n+2];

       //base case alrady satisfied

       //reverse changing params

       for(int i=n; i>=1; i--){

        for(int j=1; j<=n; j++){

            if(i>j)  continue;

            int max = Integer.MIN_VALUE;

            for(int ind=i; ind<=j; ind++){

                int cost = (arr[i-1]* arr[ind] * arr[j+1] )+
                           dp[i][ind-1] + dp[ind+1][j];

                max = Math.max(max, cost);
            }

            dp[i][j]= max;

        }
       }

        return dp[1][n];
    }
}
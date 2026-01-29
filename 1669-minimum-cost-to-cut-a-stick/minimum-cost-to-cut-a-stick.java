class Solution {

    // tabulation 
    
    public int minCost(int n, int[] cuts) {
        
        int m = cuts.length;

        int[] arr = new int[m + 2];
        
        System.arraycopy(cuts, 0, arr, 1, m);
        arr[0] = 0;
        arr[m + 1] = n;
        Arrays.sort(arr);

        int[][] dp = new int[m+2][m+2];

        for(int i=m; i>=1; i--){

            for(int j=1; j<=m; j++){

                if(i>j) continue;

                int mincost = Integer.MAX_VALUE;

               for(int ind=i; ind<=j; ind++){

                int cost = arr[j+1]-arr[i-1] + dp[i][ind-1]+ dp[ind+1][j];

                mincost = Math.min(mincost, cost);
            }
        
                 dp[i][j]=mincost;
            }
        }

        return dp[1][m];
    }
}
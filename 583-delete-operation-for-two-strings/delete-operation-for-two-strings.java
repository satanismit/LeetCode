class Solution {

    public int minDistance(String word1, String word2) {
        
        int m=word1.length();
        int n=word2.length();

    //create one 2d array - dp 
        int[][] dp= new int[m+1][n+1];

    // we not need to initialize array because it is already default having 0 values 
    
    //use dynamic programming with formula :
    for(int i=1; i<=m; i++){

        for(int j=1; j<=n; j++){

            if(word1.charAt(i-1)==word2.charAt(j-1)){

                dp[i][j]=dp[i-1][j-1]+1;
            }
            else{

                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }

    //now we have LCS from both string
    int LCS = dp[m][n];

    //return (string length - LCS) for both string to cound delete operation
    return m+n-(2*LCS);

    }
}
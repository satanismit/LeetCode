class Solution {

    //tabulation 
    public int longestPalindromeSubseq(String s) {
        
    
        StringBuilder str = new StringBuilder(s);

        str.reverse();

        String s1 = s;
        String s2 = str.toString();

        int m  =s1.length(), n=s2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=1; i<=m; i++){

            for(int j=1; j<=n; j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{

                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
       

    }
    
}
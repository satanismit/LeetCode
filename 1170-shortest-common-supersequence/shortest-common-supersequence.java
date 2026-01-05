class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {

        int m=str1.length();
        int n=str2.length();

    //create one 2d array - dp 
        int[][] dp= new int[m+1][n+1];

    // we not need to initialize array because it is already default having 0 values 
    
    //use dynamic programming with formula :
    for(int i=1; i<=m; i++){

        for(int j=1; j<=n; j++){

            if(str1.charAt(i-1)==str2.charAt(j-1)){

                dp[i][j]=dp[i-1][j-1]+1;
            }
            else{

                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }

    //now we have LCS from both string
    int LCS = dp[m][n];
    StringBuilder ans = new StringBuilder();

    int i=m, j=n;
    
    while(i>0 && j>0){

        if(str1.charAt(i-1)==str2.charAt(j-1)){
            ans.append(str1.charAt(i-1));
            i--; j--;
        }
        else if(dp[i-1][j] > dp[i][j-1]){ //move to up

            ans.append(str1.charAt(i-1));
            i--;
        }else{                        //move to left

            ans.append(str2.charAt(j-1));
            j--;
        }
    }

    //either i or j is remaining 
    while(i>0) {
        ans.append(str1.charAt(i-1)); i--;
    }

    while(j>0) {
        ans.append(str2.charAt(j-1)); j--;
    }

    return ans.reverse().toString();

        
    }
}
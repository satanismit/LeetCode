class Solution {

    
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        //create dp array
        int[][] dp =new int[m][n];

        //fill last row
        for(int i=0; i<n; i++) dp[m-1][i]= matrix[m-1][i];

        for(int i=m-2; i>=0; i--){

            for(int j=0; j<n; j++){

                //down_left
                int down_left = (j>0) ? matrix[i][j]+ dp[i+1][j-1]: Integer.MAX_VALUE;
                //down
                int down = matrix[i][j]+dp[i+1][j];
                //down_right
                int down_right = (j<n-1)? matrix[i][j] +dp[i+1][j+1]:Integer.MAX_VALUE;

                dp[i][j] = Math.min(down, Math.min(down_left,down_right));
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i:dp[0]){
            min = Math.min(min, i);
        }

        return min;
        
    }
}
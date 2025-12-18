class Solution {

    public int solve(int i,int j,int[][] memo,int[][] obstacleGrid){

        //base cases
        // out of bounds
        if (i < 0 || j < 0) return 0;

        // obstacle cell
        if (obstacleGrid[i][j] == 1) return 0;

        // start cell
        if (i == 0 && j == 0) return 1;

        if(memo[i][j]!=-1)   return memo[i][j];


        int up = solve(i-1,j,memo,obstacleGrid);
        int left = solve(i,j-1,memo,obstacleGrid);

        return memo[i][j]= up+left;

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] memo =new int[m][n];

        for(int[] rows:memo){
            Arrays.fill(rows,-1);
        }


        return solve(m-1,n-1,memo,obstacleGrid);
    }
}
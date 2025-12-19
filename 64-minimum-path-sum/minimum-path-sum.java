class Solution {

    //memoization 
    public int solve(int[][] grid,int m,int n,int i,int j,int[][] memo){

        //base case
        if(i>m || j>n)  return Integer.MAX_VALUE;
        if(i==m && j==n) return grid[i][j];
        
        if(memo[i][j]!=-1)  return memo[i][j];

        int down =solve(grid,m,n,i+1,j,memo); //down 
        int right =  solve(grid,m,n,i,j+1,memo);  // right 

        return  memo[i][j]= grid[i][j]+ Math.min(right,down);

    }

    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;

        int[][] memo = new int[m][n];

        for(int[] rows:memo)  Arrays.fill(rows, -1);

        return solve(grid,m-1,n-1,0,0,memo);
    }
}
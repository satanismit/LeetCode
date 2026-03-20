class Solution {

    int[][] memo;

    public int solve(int[][] grid, int i, int j){

    
        if(i==0 && j==0)  return grid[i][j];
        if(i<0 || j<0)  return (int)1e9;

        if(memo[i][j]!=-1) return memo[i][j];

        int up = grid[i][j] + solve( grid, i-1, j);
        int left = grid[i][j] + solve(grid, i, j-1);

        return memo[i][j]=Math.min(up, left);

    }

    public int minPathSum(int[][] grid) {

        int n= grid.length;
        memo = new int[n][grid[0].length];

        for(int[] rows: memo)  Arrays.fill(rows, -1);

        return solve(grid, n-1, grid[0].length-1);
        
    }
}
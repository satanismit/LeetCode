class Solution {

    public boolean isValid(int r, int c, int[][] grid, boolean[][] vis){

        int n=grid.length;
        int m= grid[0].length;

        return ( r>=0 && c>=0 && r<n && c<m && grid[r][c]==0 && !vis[r][c]);
    }

    public void dfs(int[][] grid, int i, int j, boolean[][] vis){

        vis[i][j] = true;

        int[] dx ={-1,1,0,0};
        int[] dy = {0,0,1,-1};

        for(int k=0; k<4; k++){

            int newR = i+dx[k];
            int newC = j+dy[k];

            if(isValid(newR,newC, grid, vis)){

                dfs(grid, newR, newC, vis);
            }
        }
    }


    public int closedIsland(int[][] grid) {

        int n= grid.length;
        int m= grid[0].length;

        boolean[][] vis = new boolean[n][m];

        //apply dfs on  first and last col
        for(int i=0; i<n; i++){

            if(grid[i][0]==0)  dfs(grid, i, 0, vis);

            if(grid[i][m-1]==0)  dfs(grid, i, m-1, vis);
        }

        //apply dfs on first and last row
        for(int i=0; i<m; i++){

            if(grid[0][i]==0)  dfs(grid, 0,i, vis);

            if(grid[n-1][i]==0)  dfs(grid, n-1,i, vis);
        }

        //count loop
        int ans = 0;

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(!vis[i][j] && grid[i][j]==0){
                    ans++;
                    dfs(grid, i, j, vis);
                }
                
            }
        }


        return ans;


        
    }
}
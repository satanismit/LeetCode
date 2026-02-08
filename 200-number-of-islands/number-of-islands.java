class Solution {

    public boolean isSafe(char[][] grid, int r, int c, boolean[][] vis){

        int m=grid.length;
        int n= grid[0].length;

        return (r>=0 && r<m && c>=0 && c<n && grid[r][c]=='1' && !vis[r][c]);
    }

    public void bfs(char[][] grid, int i, int j, boolean[][] vis){

        Queue<int[]> q= new LinkedList<>();

        q.offer(new int[]{i,j});

        vis[i][j]=true;

        while(!q.isEmpty()){

            int[] ele = q.poll();
            int r = ele[0];
            int c = ele[1];

            int[] dx={1,-1,0,0};
            int[] dy={0,0,1,-1};

            for(int k=0; k<4; k++){

                int newR = r + dx[k];
                int newC = c + dy[k];
                
            if(isSafe(grid, newR, newC, vis)){
                vis[newR][newC]=true;
                q.offer(new int[]{newR, newC});
            }
                
            }
        }

    }
    public int numIslands(char[][] grid) {

        int m= grid.length, n=grid[0].length;
        boolean[][] vis = new boolean[m][n];

        int count=0;

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                if(grid[i][j]=='1' && !vis[i][j] ){
                    count++;
                    bfs(grid, i,j, vis);
                }
            }
        }

        return count;
    }
}
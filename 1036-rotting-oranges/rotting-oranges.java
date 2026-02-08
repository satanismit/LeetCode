class Solution {

    class Pair{
        int r, c, t;

        Pair(int r, int c, int t){
            this.r=r;
            this.c=c;
            this.t=t;
        }
    }

    public boolean isSafe(int[][] grid, int r, int c, boolean[][] vis){

        int n=grid.length;
        int m= grid[0].length;

        return (r<n && r>=0 && c<m && c>=0 && grid[r][c]==1 && !vis[r][c]);
    }

    public int orangesRotting(int[][] grid) {

        int n= grid.length;
        int m=grid[0].length;

        Queue<Pair> q= new LinkedList<>();

        boolean[][] vis = new boolean[n][m];

        int cntfresh=0;

        // may have multiple rotten orange in starting 
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    vis[i][j]=true;
                }

                if(grid[i][j]==1) cntfresh++;
            }
        }

        int[] dx = {-1, 1, 0,0};
        int[] dy = {0,0,1,-1};

        int time =0;
        int cnt=0;
        while(!q.isEmpty()){

        
             Pair ele = q.poll();
            int r=ele.r;
            int c=ele.c;
            int t=ele.t;

            time = Math.max(time, t);
            

            for(int k=0; k<4; k++){

                int newR= r+dx[k];
                int newC= c+dy[k];

                if(isSafe(grid, newR, newC, vis)){
                    cnt++;
                    vis[newR][newC]=true;
                    q.offer(new Pair(newR, newC,t+1));
                }
            }


        }

        if(cnt!=cntfresh) return -1;

        return time;
        
    }
}
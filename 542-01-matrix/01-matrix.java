class Solution {

    class Pair{

        int row, col;
        int step;

        Pair(int r, int c, int st){
            this.row = r;
            this.col = c;
            this.step = st;
        }
    }

    public boolean isSafe(int[][] mat, boolean[][] vis, int r, int c){

        int n= mat.length;
        int m= mat[0].length;

        return ( r<n && r>=0 && c>=0 && c<m && !vis[r][c] && mat[r][c]==1);
    }


    public int[][] updateMatrix(int[][] mat) {

        int n= mat.length;
        int m= mat[0].length;

        int[][] dis = new int[n][m];

        boolean[][] vis = new boolean[n][m];

        Queue<Pair> q= new LinkedList<>();

        //add all the 0's in queue 
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }

            }
        }

        // now calculate distances of all 1's  from 0's ( level wise)
        while(!q.isEmpty()){

            Pair cur = q.poll();
            int r = cur.row;
            int c= cur.col;
            int st = cur.step;

            dis[r][c]=st;

            //add neighbors 
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};

            for(int k=0; k<4; k++){

                int nrow = r+dx[k];
                int ncol = c+dy[k];

                if(isSafe(mat, vis, nrow, ncol)){

                    q.add(new Pair(nrow, ncol, st+1));
                    vis[nrow][ncol]= true;
                }
            }

        }
        
        return dis;
        
    }
}
class Solution {

    public class Node{
        
         int dis;
         int i, j;
         
         Node(int dis, int i, int j){
             
             this.dis = dis;
             this.i = i;
             this.j =j;
         }
    };
    
    public boolean isSafe(int[][] grid, int r, int c, boolean[][] vis){
            
            int n = grid.length;
            int m= grid[0].length;
            
    return (r<n && r>=0 && c>=0 && c<m && grid[r][c]!=1 && !vis[r][c]);
    }
    
    public int bfs(int desx, int desy, int[][] grid, int srcx, int srcy){

        int n= grid.length;
        int m= grid[0].length;

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(1,srcx, srcy));  //add source node 

         if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return -1;
            
        boolean[][] vis = new boolean[n][m];
        
        vis[srcx][srcy]=true;
        
        while(!q.isEmpty()){
            
            Node node =q.poll();
            
            int r = node.i;
            int c = node.j;
            int dis = node.dis;
            
            if(r==desx && c==desy)  return dis;
            
            int[] dx = {-1,1,0,0,1,-1,1,-1};
            int[] dy = {0,0,1,-1,1,-1,-1,1};
            
            
            for(int k=0; k<8; k++){
                
                int row = r+dx[k];
                int col = c+dy[k];
                
                if(isSafe(grid, row, col, vis)){
                    q.offer(new Node(dis+1, row, col));
                    vis[row][col]=true;
                }
            }
            
        }
        return -1;
        
    }


    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n= grid.length;
        int m= grid[0].length;


        return bfs(n-1, m-1, grid, 0,0);   
    }
}
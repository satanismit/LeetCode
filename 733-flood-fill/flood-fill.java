class Solution {

    public boolean isSafe(int[][] ans, int[][] image, int r, int c, int inicolor, int newcolor){

        int n=image.length;
        int m= image[0].length;

        return (r>=0 && r<n && c>=0 && c<m && image[r][c]==inicolor && ans[r][c]!=newcolor);
    }

    public void dfs(int[][] ans, int[][] image, int sr, int sc, int inicolor, int newcolor){

        ans[sr][sc]=newcolor;

        //call for neighbors 

        int[] dx = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        for(int k=0; k<4; k++){

            int newR= sr+dx[k];
            int newC = sc+dy[k];

            if(isSafe(ans,image, newR, newC,inicolor, newcolor)){
                dfs(ans, image, newR, newC,inicolor, newcolor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        //create copy of dataset
        int[][] ans = image;
        int inicolor = image[sr][sc];

        if(inicolor==color)  return image;

        dfs(image, ans, sr, sc, inicolor,color);

        return ans;
        
    }
}
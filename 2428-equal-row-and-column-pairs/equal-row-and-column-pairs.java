class Solution {
    public int equalPairs(int[][] grid) {
       
       int m=grid.length;
       int n=grid[0].length;
        int cnt=0;
       for(int i=0; i<m; i++){

        for(int j=0; j<n; j++){

            if(equals(grid, i, j, n)){
                cnt++;
            }
        }
       }
       return cnt;
    }

    public boolean equals(int[][] arr, int i, int j,int n){

        for(int k=0; k<n; k++){

            if(arr[i][k]!=arr[k][j]){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        
        int n= grid.length;
        int m = grid[0].length;

        for(int i=0; i<n-1; i++){

            for(int j=0; j<m-1; j++){

                if(grid[i][j]!=grid[i+1][j] || grid[i][j]==grid[i][j+1]){
                    return false;
                }

            }
        }

        //check last rows for right element 
        for(int i=0; i<m-1; i++){

            if( grid[n-1][i]==grid[n-1][i+1]){
                    return false;
                }

        }

        //check for last column 
        for(int i=0; i<n-1; i++){

            if( grid[i][m-1]!=grid[i+1][m-1]){
                    return false;
                }

        }


        return true;
    }
}
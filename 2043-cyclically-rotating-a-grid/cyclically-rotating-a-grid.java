class Solution {

    public int[][] rotateGrid(int[][] grid, int k) {

        int B = grid.length -1 ;
        int R = grid[0].length -1 ;
        int T =0;
        int L =0;

        while( T<B && L<R){

            int width = R-L;
            int length = B-T;
            int p= 2 *( width + length);

            int r = k % p;

            while(r-->0){

                int temp = grid[T][L];

                // left to right
                for(int i=L; i<R; i++){
                    grid[T][i] = grid[T][i+1];
                }

                //top to bottom 
                for(int i=T; i<B; i++){
                    grid[i][R] = grid[i+1][R];
                }

                //right to left 
                for(int i=R; i>L; i--){
                    grid[B][i] = grid[B][i-1];
                }

                // bottom to top 
                for(int i=B; i>T; i--){
                    grid[i][L]=grid[i-1][L];
                }

                grid[T+1][L]=temp;

            }

            T++; L++;
            B--; R--;
        }
        return grid;
        
    }


}
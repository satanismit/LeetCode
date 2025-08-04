class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int[][] mat=new int[n][n];
        int num=1;

        int top=0, bottom=n-1;
        int left=0, right=n-1;

        while(left<=right && top<=bottom){

            //traverse from left to right for top 
            for(int i=left; i<=right; i++){
                mat[top][i]=num++;
            }

            //traverse from top+1 to bottom for right
            for(int i=top+1; i<=bottom; i++){
                mat[i][right]=num++;
            }

            if(top<bottom){

                 //traverse from right-1 to left for bottom
                for(int i=right-1; i>=left; i--){
                        mat[bottom][i]=num++;
                }
            }
           
            if(left<right){

                //traverse from bottom to top+1 fot left
                for(int i=bottom-1; i>=top+1; i--){
                    mat[i][left]=num++;
                }
            }
           

            top++; bottom--;
            left++; right--;
        }

        return mat;
        
    }
}
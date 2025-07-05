class Solution { 

    int[][] dir={
         {-1,-1},{-1,0},{-1,1},
         {0,-1},{0,0}, {0,1},
         {1,-1}, {1,0},{1,1}
    };

    int m,n;
   
    public int[][] imageSmoother(int[][] img) {
        
         m=img.length;
         n=img[0].length;

        int[][] output=new int[m][n];
         for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                    output[i][j]=smoother(img,i,j);
            }
         }
         return output;

    }

    private int smoother(int[][] arr, int i, int j){
            int sum=0,count=0;

            for(int[] d: dir){

                int i_=i+d[0];
                int j_=j+d[1];

                if(i_>=m || j_>=n || i_<0 || j_<0){ continue;}

                sum+=arr[i_][j_];

                count++;
            }

            return sum/count;
    }
}
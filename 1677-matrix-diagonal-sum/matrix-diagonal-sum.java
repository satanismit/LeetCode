class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n=mat.length;
       
        int sum=0;
        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
         int i=0,j=n-1;

            while(i<n && j>=0){

                sum+=mat[i][j];
                    i++; 
                    j--;

            }
            // remove middle element 
            if(n%2!=0){

                int idx=n/2;
                int mid=mat[idx][idx];
                sum = sum-mid;
            }
            return sum;
    }
}
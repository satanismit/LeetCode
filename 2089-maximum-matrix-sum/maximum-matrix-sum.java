class Solution {

    public long maxMatrixSum(int[][] matrix) {

        int m = matrix.length;
        int n= matrix[0].length;

        //count absolute sum 
        long  ab_sum = 0;
        int cnt_neg = 0;
        int small_abs = Integer.MAX_VALUE;

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                ab_sum += Math.abs(matrix[i][j]);

                if(matrix[i][j]<0) cnt_neg++;

                small_abs = Math.min(small_abs, Math.abs(matrix[i][j]));

            }
        }

        //if negative number is even we flip all negative number and ab_sum is answer.
        if(cnt_neg % 2==0) return ab_sum;

        return ab_sum -(2*small_abs);


    }
}
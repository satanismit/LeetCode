class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int res = 0;

        for(int i=1; i<m; i++){

            for(int j=0; j<n; j++){

                if(matrix[i][j]==1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }

        // now we have our height matrix of 1's
        int area = 0;

        for(int i=0; i<m; i++){

            Arrays.sort(matrix[i]);

            for(int j=0; j<n; j++){

                area = Math.max(area, matrix[i][j]*(n-j));
            }
        }

        return area;
    }
}
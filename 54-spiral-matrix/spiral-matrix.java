class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new ArrayList<>();

        int m=matrix.length, n=matrix[0].length;

        int top=0,bottom=m-1;
        int left=0,right=n-1;

        while(top<=bottom && left<=right){

            //traverse from left to right for top 
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }

            //traverse from top+1 to bottom for right 
            for(int i=top+1; i<=bottom; i++){
                res.add(matrix[i][right]);
            }

            //traverse from right-1 to left for bottom 

            if(top<bottom){
                for(int i=right-1; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
            }

            //traverse from bottom-1 to top+1 for left
            if(left<right){
                for(int i=bottom-1; i>=top+1; i--){
                res.add(matrix[i][left]);
            }
            }

            left++;
            right--;
            top++;
            bottom--;

        }

        return res;
    }
}
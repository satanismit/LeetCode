class Solution {
    public boolean checkValid(int[][] matrix) {

        int n= matrix.length;
        int m = matrix[0].length;

        //check for rows:
        for(int[] rows:matrix){
            
            Set<Integer> set =new HashSet<>();
            for(int ele:rows){
                set.add(ele);
            }
            
            if(set.size()!=n)  return false;

        }
    
        //check for columns :
        for(int j=0; j<m;j++){

         Set<Integer> set =new HashSet<>();
         for(int i=0; i<n; i++){
           
           set.add(matrix[i][j]);

        }
        if(set.size()!=n) return false;
       }

       return true;
        
        
    }
}
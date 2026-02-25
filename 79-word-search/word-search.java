class Solution {

    public boolean backtrack(char[][] mat, int i, int j,int wind, String word){
        
        int n= mat.length;
        int m= mat[0].length;
        
         //true condition
        if(wind==word.length())  return true;
        
        
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }

        //check ele are valid
        
        if(word.charAt(wind)==mat[i][j]){
                
                 char temp = mat[i][j];
                 mat[i][j]='#';
                 
                //check all it's neighbor for next index
                 boolean found = backtrack(mat, i-1,j, wind+1, word) ||
                         backtrack(mat, i+1,j, wind+1, word) ||
                         backtrack(mat, i,j-1, wind+1, word) ||
                         backtrack(mat, i,j+1, wind+1, word);

                //backtrack          
                mat[i][j]=temp;
                
                 return found;
        }
        
          
        return false;
        
    }
    
    public boolean exist(char[][] board, String word) {
        
         int wLen = word.length();
        int n= board.length;
        int m= board[0].length;
        
         if (wLen > n * m)
            return false;
            
        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                
                if(word.charAt(0)==board[i][j]){
                    
                    if(backtrack(board, i, j, 0,word))    return true;
                }
            }
        }
        
        
        return false;
        
    }
}
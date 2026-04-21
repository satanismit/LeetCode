class Solution {

    public boolean isSafe(int i, int j, char[][] board){

        int row = i;
        int col =j;

        //check upperleft
        while( i>=0 && j>=0) {

            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        i=row;
        j=col;

        //check upper
        while(i>=0){
            if(board[i][j]=='Q') return false;
            i--;
        }

        i=row;
        //check upperright
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        return true;

    }

    List<List<String>> ans = new ArrayList<>();

    public void solve(int row,char[][] board){

        if(row==board.length) {

            List<String> list = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;

        }

        for(int i=0; i<board[row].length; i++){

            if(isSafe(row, i, board)){

                board[row][i]='Q';
                solve(row+1, board);
                board[row][i]='.';
            }
        }

    }


    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for(char[] rows:board)  Arrays.fill(rows, '.');

        solve(0, board);

        return ans;
        
        
    }

    
}
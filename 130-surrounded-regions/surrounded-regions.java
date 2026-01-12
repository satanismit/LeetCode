class Solution {

    public void dfs(char[][] board,int i, int j){

        int n= board.length;
        int m= board[0].length;

        if(i<0 || i>=n || j<0 || j>=m || board[i][j] !='O'){
            return;
        }

        board[i][j]= '#';

        dfs(board, i-1,j);
        dfs(board, i+1,j);
        dfs(board, i,j-1);
        dfs(board, i,j+1);




    }

    public void solve(char[][] board) {

        int n= board.length;
        int m= board[0].length;

        //check for all boundry if O present or not 
        for(int i=0; i<n; i++){               //first and last columns 
            if(board[i][0]=='O')  dfs(board, i, 0);

            if(board[i][m-1]=='O')  dfs(board, i, m-1);
        }

        for(int i=0; i<m; i++){               // frist and last rows 
            if(board[0][i]=='O')  dfs(board, 0, i);

            if(board[n-1][i]=='O')  dfs(board, n-1, i);
        }

        //flip all O ---> X and #---> O

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(board[i][j]=='O')  board[i][j]='X';
                
                if(board[i][j]=='#')  board[i][j]='O';

                
            }
        }


    }
}
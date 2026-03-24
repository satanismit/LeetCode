class Solution {

    public int[] solve(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];

        int[] pref= new int[n];
        int[] suff = new int[n];

        pref[0]=1;
        suff[n-1]=1;

        for(int i=1; i<n; i++){
            pref[i]= (pref[i-1]*(arr[i-1]%12345)) %12345;
        }

        for(int i=n-2; i>=0; i--){
            suff[i]= (suff[i+1]*(arr[i+1]%12345)) %12345;
        }

        for(int i=0; i<n; i++){
            ans[i]= (int)(suff[i]*pref[i]) %12345;
        }


        return ans;
    }
    
    public int[][] constructProductMatrix(int[][] grid) {
        
        int n= grid.length;
        int m= grid[0].length;

        int[] arr= new int[m*n];
        int ind=0;

        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){

                arr[ind++]=grid[i][j];
            }
        }

        int[] ans =solve(arr);
        ind=0;

        int[][] mat = new int[n][m];

        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){

                mat[i][j]=ans[ind++];
            }
        }
        
        return mat;


        
    }
}
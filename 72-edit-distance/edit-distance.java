class Solution {
    

    public int solve(String s1,String s2, int n, int m,int[][] memo){

        //base case 
        if(m==0) return n;
        if(n==0) return m;

        if(memo[n][m]!=-1) return memo[n][m];

        //explore all possiblities 
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            
            return memo[n][m]=solve(s1, s2, n-1, m-1, memo);
        }

            return memo[n][m]=1+ Math.min(solve(s1,s2,n,m-1,memo), Math.min(solve(s1,s2,n-1,m-1,memo), solve(s1,s2,n-1,m,memo)));
        
    }
    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m= word2.length();

        int[][] memo= new int[n+1][m+1];

        for(int[] rows:memo) Arrays.fill(rows, -1);

        return solve(word1, word2, n, m, memo);
        
    }
}
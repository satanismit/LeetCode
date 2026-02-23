class Solution {

    int[][] memo;

    public int LCS(String s1, String s2, int m, int n){

        if(m==0 || n==0) return 0;

        if(memo[m][n]!=-1)  return memo[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return memo[m][n]= 1 + LCS(s1, s2, m-1, n-1);
        }

        return memo[m][n]=Math.max( LCS(s1,s2,m-1,n), LCS(s1,s2,m, n-1) );

    }

    public int minInsertions(String s) {

        int n = s.length();

        StringBuilder str = new StringBuilder(s);
        str.reverse();
        
        memo = new int[n+1][n+1];
        for(int[] rows:memo)  Arrays.fill(rows, -1);

        int lcs =  LCS(s, str.toString(), n,n);

        return n-lcs;


    }
}
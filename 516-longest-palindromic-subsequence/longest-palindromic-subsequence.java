class Solution {


    //memoization 
    public int solve(String s1, String s2, int m, int n, int[][] memo){

        //base case
        if(m==0 || n==0)  return 0;

        if(memo[m][n]!=-1)  return memo[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)){

            return 1+ solve(s1,s2,m-1,n-1, memo);
        }

        return memo[m][n]=Math.max( solve(s1, s2, m-1,n, memo) , solve(s1, s2,m, n-1, memo));


    }


    public int longestPalindromeSubseq(String s) {
        
       

        StringBuilder str = new StringBuilder(s);

        str.reverse();

        String s1 = s;
        String s2 = str.toString();

        int m  =s1.length(), n=s2.length();

        int[][] memo = new int[m+1][n+1];

        for(int[] rows:memo) Arrays.fill(rows, -1);

        //apply LCS 
        return solve(s1, s2, m, n, memo);

    }
    
}
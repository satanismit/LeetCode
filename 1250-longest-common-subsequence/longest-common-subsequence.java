class Solution {

    // recursion : TC : O(2^ min(m,n)), SC: O(min(m,n))

    //memoization : TC: O(m*n) , SC: O(m*n)
    public int solve(String st1, String st2, int m, int n, int[][] memo){


        //base case 
        if(m==0 || n==0) return 0;

        if(memo[m][n]!=-1)  return memo[m][n];

        //match 
        if(st1.charAt(m-1)==st2.charAt(n-1)){

       return  memo[m][n]=1 + solve(st1, st2, m-1, n-1, memo);

        }
        //do not match 
        return memo[m][n]=Math.max( solve(st1, st2, m-1,n, memo), solve(st1, st2, m, n-1, memo));


    }
    
    public int longestCommonSubsequence(String text1, String text2) {

        
        int m = text1.length();
        int n= text2.length();

        if(m==0 || n==0) return 0;

        int[][] memo = new int[m+1][n+1];

        for(int[] rows : memo)  Arrays.fill(rows, -1);


        return solve( text1, text2, m, n, memo);
        
    }
}
class Solution {

    //count no of ways recursion +memoization  
    public int solve(String s, String t,int i,int j, int[][] memo){

        //base case either 0 or 1
        if(j<0) return 1;
        if(i<0) return 0;

        if(memo[i][j]!=-1)  return memo[i][j];

        //explore all possibilities 
        if(s.charAt(i)==t.charAt(j)) {

            return memo[i][j]=solve(s,t,i-1,j-1, memo)+solve(s,t,i-1,j, memo);
        }


        return memo[i][j]=solve(s, t, i-1,j, memo);

        //return max 


    }
    public int numDistinct(String s, String t) {

        int n=s.length(), m= t.length();

        int[][] memo = new int[n][m];

        for(int[] rows:memo) Arrays.fill(rows, -1);

        return solve(s,t,n-1,m-1, memo);
        
    }
}
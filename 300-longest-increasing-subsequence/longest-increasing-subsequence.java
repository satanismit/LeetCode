class Solution {

    //memoization
    public int solve(int ind, int prevind, int[] nums, int[][] memo){

        //base case
        if(ind==nums.length)  return 0;

        if(memo[ind][prevind+1]!=-1)  return memo[ind][prevind+1];
        //take
        int take = 0;     
    
        if(prevind==-1 || nums[prevind]<nums[ind]){
             take =  1+ solve(ind+1, ind, nums, memo);
        }
       
        //not take
        int nottake = solve(ind+1, prevind, nums, memo);

        return memo[ind][prevind+1]= Math.max(take, nottake);

    }

    public int lengthOfLIS(int[] nums) {

        int n= nums.length;

        int[][] memo = new int[n][n+1];

        for(int[] rows:memo) Arrays.fill(rows, -1);

        return solve(0,-1, nums, memo);


        
    }
}
class Solution {

    long[][] memo;

    public long solve(int[] nums,int l , int r){

        if(l==r)  return nums[l];

        if(memo[l][r]!=-1) return memo[l][r];


        long takeleft = nums[l] - solve(nums, l+1, r);
        long takeright = nums[r] - solve(nums, l, r-1);

        return memo[l][r]=Math.max( takeleft, takeright);
    } 


    public boolean predictTheWinner(int[] nums) {

        int n= nums.length;

        memo= new long[n][n];    

        for(long[] rows:memo) Arrays.fill(rows, -1);

        long dp = solve(nums, 0, n-1);

        //count first player points 
        long sum =0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }

        //dp = f -s (max diff btw (current player - opponent))'
        
        long first = (dp + sum )/2;
        long second = (sum - dp)/2;

        return first>=second;


        
    }
}
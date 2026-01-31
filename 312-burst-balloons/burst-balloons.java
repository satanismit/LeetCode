class Solution {

    // memoization TC = O( n^3 ) ,sc = O(n^2) + O(N) AS
    int[][] memo;

    public int solve(int[] nums, int i, int j){

        if(i>j)  return 0;

        if(memo[i][j]!=-1)  return memo[i][j];

        int max = Integer.MIN_VALUE;

        for(int ind=i; ind<=j; ind++){

            int cost = (nums[i-1]* nums[ind] * nums[j+1] )+
                       solve(nums, i,ind-1)+solve(nums, ind+1,j);

            max = Math.max(max, cost);
        }

        return memo[i][j]= max;

    }
    
    public int maxCoins(int[] nums) {

        int n= nums.length;

        int[] arr=new int[n+2];

        System.arraycopy(nums, 0, arr, 1, n);
        arr[0]=1;
        arr[n+1]=1;

        memo = new int[n+2][n+2];

        for(int[] rows:memo) Arrays.fill(rows, -1);

        return solve(arr,1,n);
    }
}
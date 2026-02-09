class Solution {

    int[] memo;

    public int solve(int[] arr, int k, int ind){

        if(ind==arr.length) return 0;

        if(memo[ind]!=-1)  return memo[ind];

        int ans=Integer.MIN_VALUE;
        int length=0, currmax= Integer.MIN_VALUE;
        int sum =0;

        for(int j=ind; j<Math.min(arr.length,ind+k); j++){
            length++;

            currmax = Math.max(currmax, arr[j]);
            
            sum = currmax*length + solve(arr, k, j+1);

            ans = Math.max(ans, sum);
            
        }

        return memo[ind]=ans;

    }

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n= arr.length;

        memo = new int[n];
        Arrays.fill(memo, -1);

        return solve(arr, k, 0);
    }
}
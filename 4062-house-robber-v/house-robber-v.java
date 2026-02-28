class Solution {
    public long rob(int[] nums, int[] colors) {

     int n = nums.length;
        if (n == 0) return 0;

        long[] dp = new long[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {

            if (colors[i] == colors[i - 1]) {

                // if we can rob both 
                // find max out of dp[i-1] and nums[i] + dp[i-2]
                dp[i] = Math.max(dp[i - 1], nums[i]+ ((i>=2)? dp[i-2]:0));

            } else {
                // if we can rob only one  
                dp[i] = nums[i] + dp[i - 1];
            }
        }

        return dp[n - 1];

    }
}
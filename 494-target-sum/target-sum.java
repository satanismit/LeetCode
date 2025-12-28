class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        
        int totalSum = 0;

        for (int n : nums) totalSum += n;

        // Base cases: target must be reachable and (totalSum + target) must be even
        if (Math.abs(target) > totalSum || (totalSum + target) % 2 != 0) {
            return 0;
        }

        int s1 = (totalSum + target) / 2;
        int n = nums.length;

        
        int[][] dp = new int[n + 1][s1 + 1];

        // Base case: There is 1 way to get sum 0 (by picking nothing)
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {

            int currentNum = nums[i - 1];

            for (int j = 0; j <= s1; j++) {

                // Option 1: Don't pick the current number
                dp[i][j] = dp[i - 1][j];

                // Option 2: Pick the current number (if it doesn't exceed current sum j)
                if (j >= currentNum) {
                    dp[i][j] += dp[i - 1][j - currentNum];
                }

            }
        }

        return dp[n][s1];
    }
}
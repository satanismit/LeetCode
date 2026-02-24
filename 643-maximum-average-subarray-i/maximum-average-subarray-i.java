class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n= nums.length;
        int sum =0;

        for(int i=0; i<k; i++){

            sum +=nums[i];
        }

        double max_sum = sum;

        for(int i=k; i<n; i++){

            sum = sum -nums[i-k] + nums[i];

            max_sum = Math.max(max_sum, sum);
        }

        return max_sum/k;
    }
}
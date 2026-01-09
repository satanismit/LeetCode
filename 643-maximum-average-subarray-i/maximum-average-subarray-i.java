class Solution {

    public double findMaxAverage(int[] nums, int k) {
        
        double ans = Integer.MIN_VALUE;

        int n=nums.length;
        double sum =0;

        //fixed size window
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        ans = Math.max(ans, sum/k);

        int left =0;

        for(int right=k; right<n; right++){

            sum += nums[right];

            sum -= nums[left++];

            ans = Math.max( ans, sum/k);

        }

        return ans;

    }
}
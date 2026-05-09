class Solution {

    public int getmax(int[] nums){

        int n=nums.length;

        int cur =nums[0];
        int max =nums[0];

        for(int i=1; i<n; i++){

          cur = Math.max( nums[i], cur+nums[i]);

          max =Math.max( max, cur);
        }

        return max;
    }

    public int getmin(int[] nums){

        int n=nums.length;

        int cur =nums[0];
        int min =nums[0];

        for(int i=1; i<n; i++){

          cur = Math.min( nums[i], cur+nums[i]);

          min =Math.min( min, cur);
        }

        return min;
    }


    public int maxSubarraySumCircular(int[] nums) {

        //circular max sum == Max (max subarray sum , total - min subarray sum )

        int total = 0;
        for(int num:nums) total+=num;

        //handle negative cases
        int maxNormal = getmax(nums);
        if(maxNormal < 0) return maxNormal;

        return Math.max( maxNormal , total - getmin(nums));
        

    }
}
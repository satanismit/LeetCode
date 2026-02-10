class Solution {
    public int dominantIndices(int[] nums) {

        int n= nums.length;

        double[] suffixavg = new double[n];

        suffixavg[n-1]=nums[n-1];
        int cursum = nums[n-1];

        for(int i=n-2; i>=0; i--){
            
            suffixavg[i] = (cursum+nums[i]) /(n-i);

            cursum += nums[i];
        }

        int count =0 ;
        for(int i=0; i<n-1; i++){

            if(nums[i]>suffixavg[i+1]) count++;
        }

        return count;


        
    }
}
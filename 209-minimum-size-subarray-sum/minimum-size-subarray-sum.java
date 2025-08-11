class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n=nums.length;

        int cursum=0, min=Integer.MAX_VALUE;

        // take two pointer 
        int low=0,high=0;

        while(high < n){

            cursum+=nums[high];
            high++;

            while(cursum>=target){

                int windowsize= high-low;

                min=Math.min(min,windowsize);

                 cursum-=nums[low];
                 low++;

            }
        }

        if(min==Integer.MAX_VALUE){
            return 0;
        }

        return min;
    }
}
class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;

        int right=0, left =0;
        int min_length = Integer.MAX_VALUE;

        int sum =0;
        while(right<n){

            sum += nums[right];

           //shrink the window 
           while(sum>=target){
            
              min_length = Math.min( min_length, right-left+1);
              sum -= nums[left++];
           }
           right++;

        }

        if(min_length==Integer.MAX_VALUE)  return 0;

        return min_length;
        
    }
}
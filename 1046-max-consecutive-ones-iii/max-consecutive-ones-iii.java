class Solution {
    public int longestOnes(int[] nums, int k) {
        
       int left=0,right;
       int n=nums.length;

       for(right =0; right<n; right++){

          if(nums[right]==0){
            k--;
          }

          if(k<0){

            if(nums[left]==0){
                k++;
            }
            left++;
          }

       }

        return right - left;

    }
}
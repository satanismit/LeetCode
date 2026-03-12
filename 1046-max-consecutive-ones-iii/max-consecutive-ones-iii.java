class Solution {

    public int longestOnes(int[] nums, int k) {

        int n=nums.length;

        int left =0, right =0;
        int ans =0;

        while(right<n){

            if(nums[right]==0)  k--;

            if(k<0){

                 if(nums[left]==0){
                    k++;
                 }
                 left++;
            }
            right++;
            ans = Math.max(ans, right-left);
        }

        return ans;
        
    }
}
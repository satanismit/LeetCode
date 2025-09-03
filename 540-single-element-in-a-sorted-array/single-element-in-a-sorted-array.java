class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;

        if(n==1){
            return nums[0];
        }

        int left=0, right=n-1;

        while(left<=right){
            

            if(nums[left]==nums[left+1]){
                left+=2;
            }else{
                return nums[left];
            }

            if(nums[right]==nums[right-1]){
                right-=2;
            }else{
                return nums[right];
            }

        }

        return 0;
    }
}
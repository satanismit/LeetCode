class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        
        for(int right=0; right<n; right++){

                //found non zero element then swap 
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
            
        }
        
    }
}
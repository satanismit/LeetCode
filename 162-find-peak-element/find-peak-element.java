class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
        int maxind=0;

        for(int i=1; i<n-1; i++){

            if(nums[i-1]<nums[i]  && nums[i]>nums[i+1]){
                maxind=i;
            }

        }
        int max=Integer.MIN_VALUE;
        if(maxind==0){
           for(int i=0; i<n; i++){

            if(max<nums[i]){
                max=nums[i];
            maxind=i;
            }
            
           }
        }

        return maxind;

    }
}
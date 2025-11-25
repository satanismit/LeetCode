class Solution {
    public int maximumDifference(int[] nums) {
        
        int n=nums.length;
        int minvalue = nums[0];
        int max = -1;


        for(int i=1; i<n; i++){
        
        if(minvalue > nums[i]){
            minvalue = nums[i];
        }else{
            max = Math.max(max, nums[i]-minvalue);
        }
            
        }
        if(max==0) return -1;
        return max;
    }

}
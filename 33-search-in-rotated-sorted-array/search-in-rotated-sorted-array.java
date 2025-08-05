class Solution {
    public int search(int[] nums, int target) {
        
        int  n=nums.length-1;
        int last=nums[n];
        int first=nums[0];

        if(first-target > last-target){

            for(int i=n; i>=0; i--){
                if(nums[i]==target){
                    return i;
                }
            }
        }else{
            for(int i=0; i<=n; i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }

        return -1;
    }
}
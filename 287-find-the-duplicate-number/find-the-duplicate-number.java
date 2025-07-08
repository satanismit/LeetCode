class Solution {
    public int findDuplicate(int[] nums) {
        
        int n=nums.length;
        int i=0;
        while(i<n){
            
            if(nums[i]!=i+1){
              int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){

                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                return nums[i];
            }
            }
            else{
                i++;
            }
        }

        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return 0;
    }
}
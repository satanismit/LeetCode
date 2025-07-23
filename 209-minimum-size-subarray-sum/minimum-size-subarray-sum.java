class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum=0,min=nums.length+1;
        int i=0;

        for(int j=0 ;j<nums.length; j++){

                sum+=nums[j];

            while(sum>=target){

                min=Math.min(min, j-i+1);
                sum-=nums[i];
                i++;

            }

        }

        if(min==nums.length+1){
            return 0;
        }



        return min;

    }
    
}

        
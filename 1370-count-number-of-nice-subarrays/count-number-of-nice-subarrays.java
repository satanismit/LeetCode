class Solution {

    public int helper(int[] nums ,int k){

        int n=nums.length;
        int left =0, right =0,sum=0;
        int count =0;

        while(right<n){

                sum+=nums[right];

                while(sum>k){
                    sum-=nums[left++];
                    
                }

                count += right-left+1;
                right++;

        }

        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n=nums.length;

        //convert into ones and zeros 
        //even - 0, odd - 1 
        for(int i=0; i<n; i++){

            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }

        return helper(nums,k)-helper(nums,k-1);
    }
}
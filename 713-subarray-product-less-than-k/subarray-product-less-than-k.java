class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

         if(k<=1) return 0;

        int n=nums.length;
        int left =0, right =0;
       
        int product =1;
        int cnt =0;

        while(right<n){

            product *=nums[right]; // add into window

            //shrink the window 
            while(product >= k){
                
                product /= nums[left];
                left++;
            }   

            cnt += right-left+1 ;  
            right++;
        }
        
        return cnt;
        
    }
}
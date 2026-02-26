class Solution {
    public boolean isArraySpecial(int[] nums) {

        int n= nums.length;
        if(n==1)  return true;

        boolean even = nums[0]%2==0;

        
        if(even){
            //check even
            for(int i=0; i<n; i+=2){
                if(nums[i]%2!=0) return false;
            }
            
            //check odd
            for(int i=1; i<n; i+=2){
                if(nums[i]%2==0) return false;
            }

        }else{
            //check odd
            for(int i=0; i<n; i+=2){
                if(nums[i]%2==0) return false;
            }

            //check even
            for(int i=1; i<n; i+=2){
                if(nums[i]%2!=0) return false;
            }
        }

        return true;
}
}
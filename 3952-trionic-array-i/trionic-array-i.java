class Solution {

    public boolean isTrionic(int[] nums) {

        int n= nums.length;
        if(n<4) return false;

        int ind =0;

       while(ind+1<n && nums[ind]<nums[ind+1]){
            ind++;
         }

         if(ind==0 || ind==n-1) return false;

         int p= ind;

        while(ind+1<n && nums[ind]>nums[ind+1]){
            ind++;
        }
        if(p==ind || ind==n-1) return false;
 
        while(ind+1<n && nums[ind]<nums[ind+1]){
            ind++;
        }

        return ind==n-1;
     
    }
}
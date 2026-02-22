class Solution {

    public void reverse(int[] nums, int i, int j){

        while(i<j){

            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++; j--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        
        int n= nums.length;

        if(k==n) return;

        k%=n;  // this is the crucial step when we have k value larger than array size

        reverse(nums, 0,n-1);

        reverse(nums, 0,k-1);

        reverse(nums, k, n-1);

    }
}
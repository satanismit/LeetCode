class Solution {
    public int search(int[] nums, int target) {

    int n=nums.length;

    int left=0,right=n-1;

    while(left<=right){

        int mid=left+(right-left)/2;

        if(nums[mid]==target){
            return mid;
        }

        //check left part sorted or not 
        if(nums[left]<=nums[mid]){

            if(nums[left]<=target && nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }  
          //check right part sorted or not 
        else{

            if(nums[right]>=target && nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
    }
    return -1;        
    }
}
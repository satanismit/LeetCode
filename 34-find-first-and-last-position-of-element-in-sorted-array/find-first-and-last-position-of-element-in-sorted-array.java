class Solution {

    private int findRightMost(int target,int[] nums,int n){

        int left=0, right=n-1;
        int ans=-1;
         while(left<=right){

            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }

    private int findLeftMost(int target,int[] nums,int n){

        int left=0, right=n-1;
        int ans=-1;
         while(left<=right){

            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int[] res=new int[2];

        Arrays.fill(res,-1);

       res[0]=findLeftMost(target,nums,nums.length);
        res[1]=findRightMost(target,nums,nums.length);
        
        return res;






    }
}
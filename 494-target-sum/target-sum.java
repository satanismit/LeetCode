class Solution {

    //memoization method
    public int solve(int[] arr, int target, int i){

        //base case 
        if(i==arr.length){
            
            return target==0 ? 1: 0;
        }

        //add + 
        int add = solve(arr, target-arr[i], i+1);

        //minus -
        int sub = solve(arr, target+arr[i], i+1);

        return add + sub;

    }

    public int findTargetSumWays(int[] nums, int target) {
        
        int n=nums.length;

        return solve(nums, target, 0);

    }
}
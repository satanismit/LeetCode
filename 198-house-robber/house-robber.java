class Solution {

    int[] arr=new int[101];

    public int solve(int[] nums, int i){

        //base
        if(i>=nums.length){
            return 0;
        }

        if(arr[i]!=-1){
            return arr[i];
        }

        int steal =nums[i]+solve(nums, i+2);
        int skip =solve(nums, i+1);

        return arr[i]=Math.max(steal, skip);
    }



    public int rob(int[] nums) {
        
        Arrays.fill(arr,-1);
        return solve(nums, 0);
    }
}
class Solution {

    public int solve(int[] nums, int target, int[] memo){

        if(memo[target]!=-1)  return memo[target];

        //base case
        if(target==0)  return 1;
        if( target<0)  return 0;

        int res =0;

        for(int num:nums){

            if(target>=num){
                res += solve(nums, target-num, memo);
            }

        }
        memo[target] = res;

        return res;

    }


    public int combinationSum4(int[] nums, int target) {

        int n= nums.length;

        int[] memo = new int[target+1];

        Arrays.fill(memo, -1);

        memo[0]=1;

        return solve(nums, target, memo);
        
    }
}
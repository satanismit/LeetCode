class Solution {

    Map<String , Integer> memo;

    //memoization method
    public int solve(int[] arr, int target, int i){

        //base case 
        if(i==arr.length){
            
            return target==0 ? 1: 0;
        }

        String key = i +"," +target;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        //add + 
        int add = solve(arr, target-arr[i], i+1);

        //minus -
        int sub = solve(arr, target+arr[i], i+1);

        memo.put(key, add + sub);
        return add + sub;

    }

    public int findTargetSumWays(int[] nums, int target) {
        
        int n=nums.length;

        memo = new HashMap<>();

        return solve(nums, target, 0);

    }
}
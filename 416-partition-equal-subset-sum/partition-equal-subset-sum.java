class Solution {

    public boolean solve(int ind, int target,int[] arr,int[][] memo){
        
        //base case 
        
        if(target==0)  return true;
        
        if(ind==0) return (arr[ind]==target);
        
        if(memo[ind][target] != -1)  return memo[ind][target]==1;
        
        //explore possibilities 
        boolean not_take = solve(ind-1, target, arr,memo);
        
        boolean take = false;
        
        if(target >= arr[ind]){
            
            take = solve(ind-1, target-arr[ind], arr,memo);
        }
        
        
        memo[ind][target] = (not_take || take) ? 1 : 0;
        return memo[ind][target] == 1;
        
    }


    public boolean canPartition(int[] nums) {

        int n=nums.length;
        int sum =0;
        
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        if(sum%2 !=0 )  return false;

        int s= sum/2;

        int[][] memo = new int[n][s+1];

        for(int[] rows:memo)  Arrays.fill(rows, -1);

        return solve(n-1 ,s,nums, memo);
        
    }
    
}
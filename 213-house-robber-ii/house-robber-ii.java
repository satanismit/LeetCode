class Solution {

    int[]  arr=new int[101];

    public int solve(int[] nums,int i,int n){

        //base condition 
        if(i>n){
            return 0;
        }

        if(arr[i]!=-1){
            return arr[i];
        }


        int steal=nums[i]+solve(nums,i+2,n); // take the house 
        int skip=solve(nums, i+1,n);  //skip the house 

        //
        return arr[i]=Math.max(steal, skip);


    }
    public int rob(int[] nums) {
        
        Arrays.fill(arr,-1);
        
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int first=solve(nums,0,n-2);
        Arrays.fill(arr,-1);
        int sec=solve(nums,1,n-1);


        return Math.max( first,sec);

    }
}
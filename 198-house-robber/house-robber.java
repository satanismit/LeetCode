class Solution {
    public int rob(int[] nums) {
        
        int[] arr=new int[101];
        int n=nums.length;

        if(n==1) return nums[0];
        arr[0]=0;
        arr[1]=nums[0];
        int steal;
        int skip;

        for(int i=2; i<=n; i++){

            steal=nums[i-1]+arr[i-2];
            skip=arr[i-1];
            
            arr[i]=Math.max(steal, skip);
        }
        return arr[n];
    }
}
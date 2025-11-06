class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int[] ng =new int[n];
        Arrays.fill(ng,-1);

        for(int i=0; i<n; i++){

            for(int j=i+1; j<i+n; j++){

                int ind=j%n;

                if(nums[ind]>nums[i]){
                    ng[i]=nums[ind];
                    break;
                }
            }
        }
        return ng;
    }
}
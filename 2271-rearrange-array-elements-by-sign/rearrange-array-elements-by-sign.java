class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int ind=0,ind2=0;

        for(int i=0; i<n; i++){

            if(nums[i]>0){

                pos[ind++]=nums[i];
            }else{

                neg[ind2++]=nums[i];
            }
        }

        int[] res =new int[n];
        int index=0;

        for(int i=0; i<n/2; i++){

            res[index++]=pos[i];
            res[index++]=neg[i];

        }

        return res;
    }
}
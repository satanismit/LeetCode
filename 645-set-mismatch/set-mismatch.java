class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n=nums.length;
        int i=0;

        while(i<n){

            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{ 
                i++;
            }
        }
        int[] res=new int[2];

        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){

              res[0]=nums[j];
              res[1]=j+1;
            }
        }
        return res;

    }
}
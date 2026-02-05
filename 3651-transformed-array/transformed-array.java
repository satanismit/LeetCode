class Solution {

    public int[] constructTransformedArray(int[] nums) {

        int n= nums.length;

        int[] res = new int[n];

        for(int i=0; i<n; i++){

            if(nums[i]>0){

                res[i]=nums[(i+ nums[i])%n ];
            }else if(nums[i]<0){

               int k= Math.abs(nums[i]);
               int ind = i;
               while(k-->0){
                  
                  if(ind==0)  {
                    ind = n-1;
                    continue;
                  }

                  ind--;
               }
               res[i] = nums[ind];

            }else{
                res[i] = nums[i];
            }
        }

        return res;
        
    }
}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int i=0;

        while(i<n){

            if(nums[i]!=nums[nums[i]-1]){
                int j=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }else{
                i++;
            }
            
        }
        for(int k=0; k<n; k++){

            if(nums[k]!=k+1){
                res.add(nums[k]);
            }

        }

        
        return res;
    }
}
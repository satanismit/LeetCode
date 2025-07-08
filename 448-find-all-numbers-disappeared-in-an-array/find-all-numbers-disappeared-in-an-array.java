class Solution {
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n=nums.length;
        int i=0;
        while(i<n){
           
            
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);

            }else{
                i++;
            }
        }
        List<Integer> res=new ArrayList<>();

        for(int j=0; j<n; j++){

            if(nums[j]!=j+1){
                res.add(j+1);
            }
        }
        return res;
    }
}
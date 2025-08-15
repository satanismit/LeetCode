class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

       List<Integer> list=new ArrayList<>();

        Arrays.sort(nums);

        int left=0,right=nums.length-1;

       for(int i=0; i<nums.length; i++){

        if(nums[i]==target){
                list.add(i);
        }
        
       }

        return list;

    }
}
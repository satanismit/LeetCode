class Solution {

    public int repeatedNTimes(int[] nums) {
        
        Set<Integer> set= new HashSet<>();

        for(int i=0; i<nums.length; i++){

            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            } else{
                return nums[i];
            }
        }

        return nums[nums.length-1]; //if not in set 
    }
}
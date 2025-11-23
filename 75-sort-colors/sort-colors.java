class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        //count frequency first for 0, 1, 2..
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1); 
        }

       
        int index = 0;

        for (int i = 0; i < 3; i++) {

            int count = map.getOrDefault(i, 0); // FIX

            while (count-- > 0) {
                nums[index++] = i;
            }
        }

    }
}
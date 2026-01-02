class Solution {
    public int repeatedNTimes(int[] nums) {

        int n= nums.length;

        //frequency array 
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            map.put( nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int max = 0;
        int ans = 0;
        for(Map.Entry<Integer, Integer> ele:map.entrySet()){

            if(max < ele.getValue()){

                  max = ele.getValue();
                  ans = ele.getKey();

            }
        }
        return ans;
    }
}
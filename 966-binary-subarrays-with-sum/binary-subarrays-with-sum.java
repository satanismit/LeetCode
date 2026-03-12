class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // prefix sum 0 occurs once initially
        map.put(0, 1);
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            
            prefixSum += num;
            
            // check if (prefixSum - goal) seen before
            if (map.containsKey(prefixSum - goal)) {
                count += map.get(prefixSum - goal);
            }
            
            // store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
        
    }
}
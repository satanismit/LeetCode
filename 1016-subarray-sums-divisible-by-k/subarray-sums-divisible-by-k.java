class Solution {

    public int subarraysDivByK(int[] nums, int k) {
        
        int n= nums.length;

        Map<Integer, Integer> map = new HashMap<>();  // prefixsum, freq

        //count prefix sum 
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i=1; i<n; i++)
        {
            prefix[i] = nums[i] + prefix[i-1];
        }

        int count = 0;

        map.put(0,1);   // base case if any ele are divisible by k then it is counted

        for(int j=0; j<n; j++){

            //case 2 reminder exists or not 
            int rem =(prefix[j]%k + k)%k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem,0)+1);
        }

        return count;
    }
}
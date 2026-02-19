class Solution {
    public int firstUniqueFreq(int[] nums) {

        int n= nums.length;
        //count freq
        Map<Integer, Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Map<Integer, Integer> freqcount = new HashMap<>();

        for(Map.Entry<Integer,Integer> ele:map.entrySet()){

            int freq = ele.getValue();
            freqcount.put( freq, freqcount.getOrDefault(freq,0)+1);
        }

        for(int i=0; i<n; i++){

            if(freqcount.get(map.get(nums[i]))==1) return nums[i];

        }

        return -1;


        
    }
}
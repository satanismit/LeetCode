class Solution {
    public boolean partitionArray(int[] nums, int k) {
        
        int n=nums.length;
        int max_dub=0;
        Map<Integer,Integer> map=new HashMap<>();


        for(int i=0; i<n; i++){
            
            map.put( nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int count:map.values()){

            if(count > n/k){
                return false;
            }
        }

        return n%k==0;
    }
}
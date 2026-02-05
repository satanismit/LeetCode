class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put( nums[i], map.getOrDefault(nums[i], 0)+1);
        }   

        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>(
            (a,b) ->  a.getValue()-b.getValue()
        );
         
       for(Map.Entry<Integer,Integer> ele:map.entrySet()){

            q.add(ele);
            if(q.size()>k){
                q.poll();
            }
        }
        
        int[] res=new int[k];
        int idx=0;

        while(!q.isEmpty()){
            res[idx++]=q.poll().getKey();

        }
        
        return res;

        
    }
}
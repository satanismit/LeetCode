class Solution {

   


    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();

        //count frequency for all elements
        for(int num:nums){
            map.put( num, map.getOrDefault(num,0)+1);
        }

        // create priority queue for sorting based on values 
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        
        // add  entry to priority queue
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
class Solution {
    
    public int lastStoneWeight(int[] stones) {

        int  n= stones.length;

        if(n==1) return stones[0];

        //create max heap - PQ
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder()); //by default min heap 

        for(int stone:stones){
            pq.add(stone);
        }

        while(!pq.isEmpty()){

            if(pq.size()==1){
                return pq.poll();
            }
            int first = pq.poll();
            int second = pq.poll();

            if(first!=second){
                int remain = Math.abs(first-second);
                pq.add(remain);
            }
        }

        return 0;





        
    }
}
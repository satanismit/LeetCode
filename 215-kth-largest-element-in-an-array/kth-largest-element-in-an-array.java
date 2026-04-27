class Solution {

    public int findKthLargest(int[] nums, int k) {

        int n= nums.length;

        Queue<Integer> pq =new PriorityQueue<Integer>();

        for(int num:nums){

             pq.add(num);
             
            if(pq.size()>k){
                pq.poll();
            }
           
        }

        return pq.poll();
        
    }
}
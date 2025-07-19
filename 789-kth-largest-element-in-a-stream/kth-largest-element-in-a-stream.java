class KthLargest {

     private Queue<Integer> q;
     private int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        q=new PriorityQueue<>(k);
       
    
       for(int i:nums){
         q.offer(i);
          if(q.size()>k){
            q.poll();
          }
         
       }
       // after ending this loop q will contain top k largest element 

       }
    
    
    public int add(int val) {
        
        q.offer(val);
        if(q.size()>k){
            q.poll();
        }
        return q.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
class SmallestInfiniteSet {

     Queue<Integer> q=new PriorityQueue<>();

    public SmallestInfiniteSet() {

        for(int i=1; i<=1000; i++){
            q.add(i);
        }
    }
    
    public int popSmallest() {
       
       if(!q.isEmpty()){
        int n=q.poll();
        return n;
       }
       
        return 0;
    
    }
    
    public void addBack(int num) {
        
        if(!q.contains(num)){
                q.add(num);
        }
       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
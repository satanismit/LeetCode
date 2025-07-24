class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;


    public MedianFinder() {
        
       left=new PriorityQueue<>(Collections.reverseOrder());//maxheap
       right=new PriorityQueue<>();//min heap 
    }
    
    public void addNum(int num) {
        
        left.add(num);

        right.add(left.poll());

        // Balance sizes 
        if (left.size() < right.size()) {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {


        if(left.size()==right.size()){
            return (double)(left.peek()+right.peek())/2;
        }
       return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
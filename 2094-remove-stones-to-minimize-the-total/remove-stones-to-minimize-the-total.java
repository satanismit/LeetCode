class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        Queue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());


        int n=piles.length;

        for(int i=0; i<n; i++){

            maxheap.add(piles[i]);
        }

        while(k-->0){

            int ele=maxheap.poll();

            maxheap.add( ele- (ele/2));

        }

        int sum=0;
        while(!maxheap.isEmpty()){

            sum+=maxheap.poll();
        }

        return sum;


    }
}
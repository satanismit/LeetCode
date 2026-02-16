class Solution {

    public boolean isNStraightHand(int[] hand, int W) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : hand){
            pq.add(i);
        }

        while(pq.size() != 0) {

            int start = pq.poll();

            for(int j = 1; j < W; j++){

                if(pq.remove(start + j)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
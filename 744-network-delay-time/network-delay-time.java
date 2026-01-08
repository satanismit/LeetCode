class Solution {

    class Pair{
        int node;
        int dist;

        Pair(int node, int dist){
            this.node= node;
            this.dist= dist;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        
        int start = k;
        int V = n;

        int[] dist = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        ArrayList<ArrayList<Pair>> adj_list= new ArrayList<>();


        for(int i = 0; i <= n; i++) { // O(V)
            adj_list.add(new ArrayList<>());
        }

        for(int[] time: times) { 
            adj_list.get(time[0]).add(new Pair(time[1], time[2]));
        }

        pq.add(new Pair(k,0));  //initialize

        dist[k]=0;

        while(!pq.isEmpty()){

            Pair cur = pq.poll();
            int node = cur.node;
            int nodedist=cur.dist;

            //add neighbors

            for(Pair ele :adj_list.get(node)){

                int neighbor = ele.node;
                int wt = ele.dist;

                if(dist[neighbor] > nodedist + wt){
                    dist[neighbor] = nodedist +wt;
                    pq.offer(new Pair(neighbor, dist[neighbor]));
                }

            }
        }

        int result = 0;
        for(int i = 1; i <= n; i++) { 

            if(dist[i] == Integer.MAX_VALUE) return -1;
            result = Math.max(result, dist[i]);
        }

        return result;

    }
}
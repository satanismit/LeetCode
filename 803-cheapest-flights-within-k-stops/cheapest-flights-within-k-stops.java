class Flight{

    int stops, node, price;

    Flight(int stops, int node, int price ){

        this.stops = stops;
        this.node = node;
        this.price = price;
    }
}

class Pair{

    int first;
    int second;

    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}


class Solution {


    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        

        //create adj list 
        List<List<Pair>> adj = new ArrayList<>();

        for(int i=0; i<n;i++){
            adj.add(new ArrayList<>());
        }

        int m= flights.length;
        for(int i=0; i<m; i++){

            adj.get(flights[i][0]).add( new Pair(flights[i][1], flights[i][2]));
        }

        //create Q
        Queue<Flight> q= new LinkedList<>();

        q.add(new Flight(0,src,0));

        //create DIS 
        int[] dis = new int[n];

        Arrays.fill(dis, Integer.MAX_VALUE);

        dis[src]=0;


        while(!q.isEmpty()){

            Flight flight = q.poll();
            int stops = flight.stops;
            int node = flight.node;
            int price = flight.price;

            if(stops>k)  continue;

            //check for adjust node
            for(Pair it:adj.get(node)){

                int adjnode = it.first;
                int edW= it.second;

                if( price + edW < dis[adjnode] && stops<=k){

                    dis[adjnode]= edW + price;
                    q.add(new Flight(stops+1, adjnode, price+edW));
                }
            }
        }

        if(dis[dst]==Integer.MAX_VALUE) return -1;


        return dis[dst];


    }
}
class Tuple{

        int diff;
        int row, col;

        Tuple(int diff, int row, int col){

            this.diff = diff;
            this.row = row;
            this.col = col;
        }
 }


class Solution {

    

    public int minimumEffortPath(int[][] heights) {

        int n= heights.length;
        int m= heights[0].length;

        //create dis array and priority queue
        PriorityQueue<Tuple> pq= new PriorityQueue<>( (a,b) -> a.diff - b.diff);

        int[][] dis = new int[n][m];

        for(int[] rows:dis)  Arrays.fill(rows, Integer.MAX_VALUE);

        dis[0][0]=0;

        pq.add(new Tuple(0,0,0));

        int[] dx={-1,1,0,0};
        int[] dy = {0,0,1,-1};


        while(!pq.isEmpty()){


            Tuple tuple = pq.poll();
            int row = tuple.row;
            int col = tuple.col;
            int diff = tuple.diff;

            //if we reach out des , we stop here
            if(row==n-1 && col==m-1)  return diff;

            for(int i=0; i<4; i++){

                int newR = row+ dx[i];
                int newC = col+ dy[i];

                if(newR >=0 && newC >=0 && newR <n && newC<m){

                    int newEffort = Math.max( 
                        Math.abs( heights[newR][newC] - heights[row][col]) , diff
                    );

                    //check if newEffort is less than existing effort then replace 
                    if(newEffort < dis[newR][newC]){
                         
                         dis[newR][newC]= newEffort;
                        pq.add(new Tuple(newEffort, newR, newC));
                    }
                }

            }


        }

        return 0;
        
    }
}
class Solution {

    public boolean bfs(int[][] graph, int src, int[] color){

        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        color[src]=0;

        while(!q.isEmpty()){

            int node = q.poll();

            for(int it:graph[node]){

                if(color[it]==-1){
                    color[it] = 1- color[node];
                    q.offer(it);

                }else if(color[it]==color[node]){
                    return true;
                }
            }

        }
         return false;
    }

    public boolean isBipartite(int[][] graph) {

        int V = graph.length;

        int[] color = new int[V];
        Arrays.fill(color, -1);


        for(int i=0; i<V; i++){

            if(color[i]==-1){
                if(bfs(graph,  i, color)){
                    return false;
                }
            }
        }

        return true;
        
    }
}
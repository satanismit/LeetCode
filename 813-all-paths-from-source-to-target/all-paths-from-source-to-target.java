class Solution {

    public void dfs(List<List<Integer>> adj,int V,List<Integer> list, List<List<Integer>> ans, int node){

        //base 
        if(node == V-1){
            list.add(node);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }

         list.add(node);
        for(int it:adj.get(node)){
           
            dfs(adj, V, list, ans, it);
            
        }
        list.remove(list.size()-1);

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> adj = new ArrayList<>();

        int V = graph.length;

        for(int i=0; i<V; i++)  adj.add(new ArrayList<>());

        for(int i=0; i<V; i++){

            for(int v : graph[i]){
                adj.get(i).add(v);
            }
        }

        // we have adjlist 
        List<List<Integer>> ans = new ArrayList<>();
        dfs(adj, V, new ArrayList<>(), ans, 0);

        return ans;

        
    }
}
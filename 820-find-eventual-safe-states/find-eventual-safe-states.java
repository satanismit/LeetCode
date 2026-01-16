class Solution {

    public static boolean dfs(int[][] graph, boolean[] vis, boolean[] pathvis, boolean[] check, int node ){


        vis[node]= true;
        pathvis[ node]= true;

            //call for neighbors 
            for(int it:graph[node]){

                if(!vis[it]){

                    if(dfs(graph, vis, pathvis, check, it)==true) return true;
                }else if(pathvis[it]==true){

                    return true;
                }
            }

        pathvis[node]= false;
        check[node]= true;
        
        return false;
        
    }


    public List<Integer> eventualSafeNodes(int[][] graph) {


    int V = graph.length;

    boolean[] vis = new boolean[V];
    boolean[] pathvis = new boolean[V];
    boolean[] check = new boolean[V];

    for(int i=0; i<V; i++){

        if(!vis[i]){

            dfs(graph, vis, pathvis, check, i);
        }

    }

    List<Integer> res = new ArrayList<>();

    for(int i=0; i<V; i++){

        if(check[i]==true)  res.add(i);
    }

    return res;

        
    }
}
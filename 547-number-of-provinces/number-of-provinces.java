class Solution {

    public void dfs(List<List<Integer>> adj, int node,boolean[] vis){

        if(!vis[node]){

            vis[node]=true;

            for(int it:adj.get(node)){

                dfs(adj, it, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        
        List<List<Integer>> adj = new ArrayList<>();

        int m= isConnected.length;
        int n= isConnected[0].length;

        for(int i=0; i<m; i++)  adj.add(new ArrayList<>());


        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                if(isConnected[i][j]==1){

                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        // now we have adjlist 
        boolean[] vis  = new boolean[m];

        int count=0;

        for(int i=0; i<m; i++){

            if(!vis[i]){
                count++;
                dfs(adj, i, vis);
            }
        }

        return count;


    }
}
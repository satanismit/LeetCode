class Solution {

    private static void dfs(ArrayList<ArrayList<Integer>> adj_list, int i, boolean[] vis){
        
        if(vis[i]!=true){
            
            vis[i]=true; 
            //call for its neighbors
            for(int ele:adj_list.get(i)){
                dfs(adj_list, ele, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int V = isConnected.length;
        boolean[] vis = new boolean[V+1];
        
        //we have an adjancy matrix need to conver into adjancy list 
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<>();
        
        //add arraylist
        for(int i=0; i<V; i++) adj_list.add(new ArrayList<>());
        
        
        for(int i=0; i<V; i++){
            
            for(int j=0; j<V; j++){
            
                //if matrix have edge we add it 
                if(isConnected[i][j]==1 && i!=j){
                    
                    adj_list.get(i).add(j);
                   adj_list.get(j).add(i);
                }
                
                
            }
            
        }
        
        int cnt = 0;
        
        //call for all components in graph and track cnt 
        for(int i=0; i<V; i++){
            
            if(vis[i]!=true){
                cnt++;
                dfs(adj_list, i, vis);
            }
        }
        
        return cnt;
        
    }
}
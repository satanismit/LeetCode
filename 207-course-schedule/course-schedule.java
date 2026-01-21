class Solution {


    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //create adjlist 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++ ) adj.add(new ArrayList<>());

        int[] indegree = new int[numCourses];

        for(int[] edge: prerequisites){

            adj.get(edge[1]).add(edge[0]);
        }

        //count indegree
        for(int i=0; i<numCourses; i++){

            for(int it:adj.get(i)){
                
                indegree[it]++;
            }
        }

        //add all 0 indegree to queue
        Queue<Integer> q= new LinkedList<>();

        for(int i=0; i<numCourses; i++)  {

            if(indegree[i]==0)  q.add(i);
        }


        //bfs kahn's algorithm 
        int visited = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while(!q.isEmpty()){

            int node = q.poll();
            res.add(node);

            visited++;

            //decrease indegree of neighbors 
            for(int it:adj.get(node)){

                indegree[it]--;
                if(indegree[it]==0)  q.add(it);
            }

        }

        
        return visited == numCourses;


    }
}
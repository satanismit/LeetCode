class Solution {
    public int equalPairs(int[][] grid) {
        

        int n=grid.length;
        // use HashMap for O(n*2) time complexity 
        Map<String,Integer> rowmap=new HashMap<>();

        for(int i=0; i<n; i++){

            //for string element in a string 
            StringBuilder str=new StringBuilder();
            for(int j=0; j<n; j++){

                str.append(grid[i][j]).append(",");

            }
            //add row into map with frequency 
            rowmap.put(str.toString(), rowmap.getOrDefault(str.toString(),0)+1);
        }

        int cnt=0;

        for(int i=0; i<n;i++){

            StringBuilder colstr=new StringBuilder();
            for(int j=0; j<n; j++){

                colstr.append(grid[j][i]).append(",");
        }
        cnt+=rowmap.getOrDefault(colstr.toString(), 0);

        }

        return cnt;
    }
}
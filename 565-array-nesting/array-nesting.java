class Solution {

    public int arrayNesting(int[] nums) {
            
        int n= nums.length;

        boolean[] vis = new boolean[n];

        int ans = 0;

        for(int i=0; i<n; i++){

            if(!vis[i]){

                int curr = i;
                int count =0;

                while(!vis[curr]){

                    vis[curr]=true;
                    curr = nums[curr];
                    count++;
                }
                 ans = Math.max(ans, count);
            }
        }
       

        return ans;
        
    }
}
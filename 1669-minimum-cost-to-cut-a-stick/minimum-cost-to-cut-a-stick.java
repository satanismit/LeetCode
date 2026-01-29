class Solution {

    int[][] memo;

    public int solve(int i, int j, int[] cuts){

    if(i>j) return 0;
    int mincost = Integer.MAX_VALUE;

    if(memo[i][j]!=-1) return memo[i][j];

    for(int ind=i; ind<=j; ind++){

        int cost = cuts[j+1]-cuts[i-1] + solve(i, ind-1,cuts)+ solve(ind+1, j,cuts);

        mincost = Math.min(mincost, cost);
    }
 
    return memo[i][j]=mincost;
    
    }
    public int minCost(int n, int[] cuts) {
        
        int m = cuts.length;

        int[] arr = new int[m + 2];
        
        System.arraycopy(cuts, 0, arr, 1, m);
        arr[0] = 0;
        arr[m + 1] = n;
        Arrays.sort(arr);

        memo = new int[m+2][m+2];
        for(int[] rows:memo) Arrays.fill(rows, -1);

        return solve(1,arr.length-2, arr);
    }
}
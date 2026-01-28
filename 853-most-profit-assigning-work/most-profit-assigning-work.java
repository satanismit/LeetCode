class Solution {

    //find bestprofit for all workers to maximize over all profit 
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int n= profit.length;
        
        //create jobs with difficulty and profit
        int[][] jobs = new int[n][2];

        for(int i=0; i<n; i++){

            jobs[i][0]=difficulty[i];
            jobs[i][1]= profit[i];
       }

       Arrays.sort(jobs, (a,b)-> a[0]-b[0]);
       Arrays.sort(worker);

    int  totalprofit =0;
    int i=0, bestprofit=0;

       for(int ability:worker){

         while(i<n && ability >= jobs[i][0]){
            bestprofit = Math.max(bestprofit, jobs[i][1]);
            i++;

         }

         totalprofit += bestprofit;     
       }

        return totalprofit;


        
    }
}
class Solution {

    public int maxCapacity(int[] costs, int[] capacity, int budget) {   

        int n= costs.length;

        int[][] list = new int[n][2];

        for(int i=0; i<n; i++){

            list[i][0]=costs[i];
            list[i][1]= capacity[i];
        }

        Arrays.sort( list , (a,b)-> a[0]-b[0]); //by cost 

        int ans = 0;
        //count prefix max 
        int[] prefixmax = new int[n];
        prefixmax[0] = list[0][1];

        for(int i=1; i<n; i++){
            prefixmax[i]= Math.max( prefixmax[i-1], list[i][1]);
        }


        //find rightmost value for every machine in list 
        for(int r=0; r<n; r++){

          int cost = list[r][0], cap = list[r][1];

          if(cost<budget){
            ans = Math.max(ans, cap);
          }else{
            break;
          }

            int remain = budget-cost;


            int l=0,h=r-1,indx=-1;
            while(l<=h){

                int mid = l+(h-l)/2;

                if(list[mid][0]<remain){
                    indx = mid;
                    l = mid+1;

                }else{
                    h = mid-1;
                }
            }

            if(indx!=-1){
                ans = Math.max(ans, prefixmax[indx] + cap);
            }
        }

        return ans;
        
        
    }
}
class Solution {

    public boolean validCapacity(int[] weights, int cap, int days){

        int n= weights.length;
        int curload = 0;
        int countdays=1;

        for(int i=0; i<n; i++){

           if(curload + weights[i] > cap){
              countdays++;
              curload = weights[i];
           }else{

               curload += weights[i];
           }
        }


        return countdays<=days; // handle if countdays <=days

    }

    public int shipWithinDays(int[] weights, int days) {

        int n= weights.length;
        int left = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            left = Math.max(left, weights[i]);
        }

         int right = 0;
        for(int i=0; i<n; i++){
           right += weights[i];
        }

        while(left<right){

            int mid = left + (right-left)/2;

            if(validCapacity(weights, mid, days)){

                right=mid;
            }else{
                left = mid+1;
            }

        }

        return left;
        
    }
}
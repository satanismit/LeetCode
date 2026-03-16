class Solution {

    public boolean checkValid(int[] arr, int day, int k, int m){

        //check  bouquets == m 
        int n = arr.length;

        int streak = 0;
        int bouquets =0;

        for(int i=0; i<n; i++){

            if(arr[i]<=day){
                streak++;
            }else{
                streak=0;
            }

              if(streak==k){
                streak=0;
                bouquets++;
            }
        }

        return m<=bouquets;

    }

    public int minDays(int[] bloomDay, int m, int k) {
        
        int n= bloomDay.length;

        if((long)m*k > n) return -1; 

        //get min value 
        int minvalue = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){

            minvalue = Math.min(minvalue, bloomDay[i]);
        }

        //get max value 
        int maxvalue = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            maxvalue = Math.max(maxvalue, bloomDay[i]);
        }

        int left = minvalue;
        int right = maxvalue;
        int ans=0;

        while(left<right){

            int mid = left + (right-left)/2;

            if(checkValid(bloomDay, mid, k, m)){

                right = mid;
            }else{

                left = mid+1;
            }

        }

        return left;
    }
}
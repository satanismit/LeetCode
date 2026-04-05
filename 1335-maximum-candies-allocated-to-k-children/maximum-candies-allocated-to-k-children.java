class Solution {

    public boolean canGive(int[] arr, long k, long val){

        long child=0;
        for(int i=0; i<arr.length; i++){

                child += arr[i]/val;
            
        }

        return child>=k;
    }


    public int maximumCandies(int[] candies, long k) {
    
     int n= candies.length;

     int left = 1;
     int right = Arrays.stream(candies).max().getAsInt(); //highest possible value for dividing candies into piles 

     while(left<=right){

        int mid = left+ (right-left)/2;

        if (mid == 0) break;

        if(canGive(candies, k ,(long)mid)){

            left = mid+1;
        }else{
            right = mid-1;

        }
     }

     return right;
    }
}
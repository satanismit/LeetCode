class Solution {
    public int minEatingSpeed(int[] piles, int h) {

            int max=0;
        for(int pile:piles){

            max=Math.max(pile,max);
        }

        int left=1,right=max;
        int ans=max;

        while(left<=right){

            int mid=left+(right-left)/2;

            long cal_h=hours(piles,mid);
            if(cal_h<=h){
                ans=mid;

                right=mid-1;
            }else{
                left=mid+1;
            }

       
        }
         return ans;
    }

    private long hours(int[] arr,int s){

        long hour=0;
        for(int i=0; i<arr.length; i++){

             hour += (arr[i] + s - 1) / s;

        }

        return hour;
    }
}
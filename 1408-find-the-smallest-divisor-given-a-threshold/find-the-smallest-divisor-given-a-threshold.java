class Solution {

    public boolean checkdivisor(int[] arr,int div,int threshold){

        int n=arr.length;
        int sum =0;
        for(int i=0; i<n; i++){

         sum += (arr[i]+div-1)/div; //equivalent to this ==Math.ceil(arr[i]/div) 
        }

        if(sum<=threshold)  return true;

        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n=nums.length;
        int max = Arrays.stream(nums).max().getAsInt(); //get max 

        int left =1, right = max;
        int ans=-1;

        while(left<=right){

            int mid = left + (right - left )/2;

            if(checkdivisor(nums,mid,threshold)){ //check divisor with threshold 
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }
}
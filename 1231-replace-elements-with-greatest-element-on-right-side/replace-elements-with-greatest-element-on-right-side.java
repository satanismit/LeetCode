class Solution {
    public int[] replaceElements(int[] arr) {

     int n=arr.length;

     for(int i=0; i<n-1; i++){

            int j=i+1;
            int max=0;
            while(j<n){

                max=Math.max(max,arr[j]);
                j++;
            }
            arr[i]=max;
            // if(max!=arr[i]){
            //     arr[i]=max;
            // }else{
            //     arr[i]=-1;
            // }
     }

     arr[n-1]=-1;

     return arr;   
    }
}
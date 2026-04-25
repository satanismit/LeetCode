class Solution {


    public int[] twoSum(int[] numbers, int target) {

        int n= numbers.length;

        int[] res = new int[2];

        for(int i=0; i<n; i++){

            int ele = numbers[i];  //fix ele

            int left =i+1;
            int right=n-1;

            while(left<=right){

                int mid = left+(right-left)/2;

                if(ele+numbers[mid]==target){
                    res[0]=i+1;
                    res[1]=mid+1;
                    return res;
                }
                else if( ele+numbers[mid] > target){

                    right = mid-1;
                }else{
                    left = mid +1;
                }
            }

            
        }
        
        return res;
        
    }
}
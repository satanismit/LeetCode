class Solution {


    public int[] twoSum(int[] numbers, int target) {

        int n= numbers.length;

        int[] ans = new int[2];

        int left = 0, right=n-1;

        while(left<right){

            if(numbers[left]+numbers[right]==target){

                return new int[]{left+1, right+1};
            }
            if(numbers[right]+numbers[left]>target){
                right--;
            }else{
                left++;
            }
        }

        return new int[0];

        
    }
}
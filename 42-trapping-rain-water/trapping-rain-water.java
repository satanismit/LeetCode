class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int left=0, right=n-1;

        int leftmax=0,rightmax=0;
        int water=0;

        while(left<right){

            // left < right
            if(height[left]<height[right]){

                if(leftmax>=height[left]){
                    water+=leftmax-height[left];

                }else{
                    leftmax=height[left];
                }
                left++;
            }
            //right > left
            else{

                if(rightmax>=height[right]){
                    water+=rightmax-height[right];

                }else{
                    rightmax=height[right];
                }
                right--;
            }

        }

        return water;
    }
}
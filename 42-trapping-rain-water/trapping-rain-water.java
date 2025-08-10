class Solution {
    public int trap(int[] height) {

      int n=height.length;

      int[] leftmax=new int[n];
      int[] rightmax=new int[n];
      int[] watertrap=new int[n];
      int totalwater =0 ;

      //intilize first value in leftmax
      leftmax[0]=height[0];

      //rightmax 
      rightmax[n-1]=height[n-1];


      

        //fill leftmax array 
        for(int j=1; j<n;j++){

            leftmax[j]=Math.max(leftmax[j-1], height[j]);
        }

        //fill rightmax array
        for(int j=n-2; j>=0;j--){

            rightmax[j]=Math.max(rightmax[j+1], height[j]);
        }

        for(int j=0; j<n; j++){

            //store small one 
          watertrap[j]=Math.min(leftmax[j],rightmax[j])- height[j];
            totalwater += watertrap[j];
        }

        return totalwater;


      


    }
}
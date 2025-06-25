class Solution {
    public int maxArea(int[] height) {
   
       int n=height.length;
       int area=0;
       int l=0,r=n-1,cur=0;

       while(l<r){

        int w=r-l;
        int h=Math.min(height[l],height[r]);
        cur=h*w;
        area=Math.max(area,cur);
        
       if( height[l] < height[r] ){ 
         l++ ;
       }else
        r--;

       }
       return area;
}
}
class Solution {
    public int hIndex(int[] citations) {
        
        int n= citations.length;

        int left = 0;
        int right=1001;

        while(left<right){

            int mid = left+ (right-left+1)/2;

            int count=0;
            
            for(int c:citations){
                if(c>=mid)  count++;
            }

            if(count>=mid)   left =mid;
            else   right=mid-1;


        }

        return left;
    }
}
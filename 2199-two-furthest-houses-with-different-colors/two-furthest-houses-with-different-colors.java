class Solution {
    public int maxDistance(int[] colors) {

        int n= colors.length;

        int dis = 0;

        //fix rightmost
        for(int i=0; i<n-1; i++){

            if(colors[i]!=colors[n-1]){
                dis = Math.max( dis, n-1-i);
            }

        }

        //fix left most
        for(int i=n-1; i>=1; i--){

            if(colors[i]!=colors[0]){
                dis = Math.max(dis, i);
            }

        }

        return dis;
        
    }
}